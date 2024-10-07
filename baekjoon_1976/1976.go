package main

import (
	"bufio"
	"os"
	"strconv"
	"strings"
)

func find(set []int, value int) int {
	if value == set[value] {
		return value
	}
	set[value] = find(set, set[value])
	return set[value]
}

func union(set []int, a, b int) {
	x := find(set, a)
	y := find(set, b)
	set[y] = x
}

func main() {
	reader := bufio.NewReader(os.Stdin)
	writer := bufio.NewWriter(os.Stdout)
	defer writer.Flush()

	nInput, _ := reader.ReadString('\n')
	n, _ := strconv.Atoi(strings.TrimSpace(nInput))
	reader.ReadString('\n')

	parent := make([]int, n+2)
	for i := 0; i <= n+1; i++ {
		parent[i] = i
	}

	for i := 0; i < n; i++ {
		input, _ := reader.ReadString('\n')
		values := strings.Fields(input)
		for index, value := range values {
			val, _ := strconv.Atoi(value)
			if val == 1 {
				union(parent, i+1, index+1)
			}
		}
	}

	root := 0
	plan, _ := reader.ReadString('\n')
	cities := strings.Fields(plan)
	for index, cityStr := range cities {
		city, _ := strconv.Atoi(cityStr)
		foundRoot := find(parent, city)
		if index == 0 {
			root = foundRoot
		} else {
			if root != foundRoot {
				writer.WriteString("NO\n")
				return
			}
		}
	}

	writer.WriteString("YES\n")
}
