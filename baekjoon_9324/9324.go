package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	reader := bufio.NewReader(os.Stdin)
	writer := bufio.NewWriter(os.Stdout)
	defer writer.Flush()

	var n int
	fmt.Fscanf(reader, "%d\n", &n)

	for t := 0; t < n; t++ {
		message, _ := reader.ReadString('\n')
		message = message[:len(message)-1]

		messageMap := make(map[rune]int)
		isFake := false

		i := 0
		for i < len(message) {
			currentChar := rune(message[i])
			messageMap[currentChar]++

			if i == len(message)-1 && messageMap[currentChar]%3 == 0 {
				fmt.Fprintln(writer, "FAKE")
				isFake = true
				break
			}

			if messageMap[currentChar]%3 == 0 {
				if i+1 >= len(message) || rune(message[i+1]) != currentChar {
					fmt.Fprintln(writer, "FAKE")
					isFake = true
					break
				}
				i++
			}

			i++
		}

		if !isFake {
			fmt.Fprintln(writer, "OK")
		}
	}
}

