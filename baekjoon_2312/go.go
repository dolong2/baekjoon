package main

import (
	"fmt"
	"sort"
)

func main() {
	var N int
	fmt.Scanln(&N)
	sieve := make([]int, 100000+1)
	for x := 2; x <= 100000; x++ {
		if sieve[x] == 1 {
			continue
		}
		for u := 2 * x; u <= 100000; u += x {
			sieve[u] = 1
		}
	}
	for i := 0; i < N; i++ {
		var n int
		fmt.Scanln(&n)
		var m map[int]int
		m = make(map[int]int)
		for i := 2; n > 1; i++ {
			if sieve[i] == 0 {
				for n%i == 0 {
					if m[i] == 0 {
						m[i] = 1
					} else {
						m[i]++
					}
					n /= i
				}
			}
		}
		sortKeys := make([]int, 0, len(m))
		for k := range m {
			sortKeys = append(sortKeys, k)
		}
		sort.Ints(sortKeys)
		for _, k := range sortKeys {
			fmt.Println(k, m[k])
		}
	}
}
