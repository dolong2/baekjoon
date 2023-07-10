package main

import (
	"fmt"
	"sort"
)

func findIndex(arr []int, value int) int {
	for i := 0; i < len(arr); i++ {
		if arr[i] == value {
			return i
		}
	}
	return -1 // 원하는 값이 없는 경우 -1을 반환
}

func main() {
	var n int
	fmt.Scan(&n)
	var a, p []int
	for i := 0; i < n; i++ {
		var value int
		fmt.Scan(&value)
		a = append(a, value)
	}
	var temp = make([]int, len(a))
	copy(temp, a)
	sort.Ints(temp)
	for _, value := range a {
		index := findIndex(temp, value)
		p = append(p, index)
		temp[index] = -1
	}
	for _, value := range p {
		fmt.Printf("%d ", value)
	}
}