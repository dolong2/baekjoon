package main

import (
    "bufio"
    "fmt"
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
    if x != y {
        set[y] = x
    }
}

func main() {
    reader := bufio.NewReader(os.Stdin)
    writer := bufio.NewWriter(os.Stdout)
    defer writer.Flush()

    input, _ := reader.ReadString('\n')
    nums := strings.Fields(input)
    n, _ := strconv.Atoi(nums[0])
    m, _ := strconv.Atoi(nums[1])

    parent := make([]int, n+1)
    for i := 0; i <= n; i++ {
        parent[i] = i
    }

    for i := 0; i < m; i++ {
        input, _ := reader.ReadString('\n')
        commands := strings.Fields(input)
        cmd, _ := strconv.Atoi(commands[0])
        a, _ := strconv.Atoi(commands[1])
        b, _ := strconv.Atoi(commands[2])

        if cmd == 0 {
            union(parent, a, b)
        } else if cmd == 1 {
            if find(parent, a) == find(parent, b) {
                writer.WriteString("YES\n")
            } else {
                writer.WriteString("NO\n")
            }
        }
    }
}
