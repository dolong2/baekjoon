import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val inputString = br.readLine()
    val boomString = br.readLine()
    val targetLength = boomString.length

    if (targetLength == 1) {
        // 폭발 문자열의 길이가 1인 경우 간단한 최적화 적용
        val targetChar = boomString[0]
        val filteredChars = inputString.filter { it != targetChar }
        if (filteredChars.isEmpty()) println("FRULA") else println(filteredChars)
        return
    }

    val result = StringBuilder()

    for (char in inputString) {
        result.append(char)
        if (result.length >= targetLength) {
            var match = true
            for (i in 0 until targetLength) {
                if (result[result.length - targetLength + i] != boomString[i]) {
                    match = false
                    break
                }
            }
            if (match) {
                result.deleteRange(resultLength - targetLength, resultLength)
            }
        }
    }

    if (result.isEmpty()) {
        println("FRULA")
    } else {
        println(result.toString())
    }
    br.close()
}
