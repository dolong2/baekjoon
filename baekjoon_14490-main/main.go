package main

import (
	"fmt"
	"strconv"
	"strings"
)

func main() {
	var a, b, c int
	var d string
	fmt.Scan(&d)
	c = strings.IndexAny(d, ":")
	a, _ = strconv.Atoi(d[0:c])
	b, _ = strconv.Atoi(d[c+1 : len(d)])
	c = gcd(a, b)
	fmt.Printf("%d:%d", a/c, b/c)
}
func gcd(a int, b int) int {
	var temp int
	if a < b {
		temp = a
		a = b
		b = temp
	}
	for b != 0 {
		temp = a % b
		a = b
		b = temp
	}
	return a
}

