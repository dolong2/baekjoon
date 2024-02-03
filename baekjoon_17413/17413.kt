import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val input = br.readLine()
    val result = StringBuilder()

    var withinTag = false
    var currentWord = StringBuilder()

    for (char in input) {
        when (char) {
            '<' -> {
                result.append(currentWord.reversed())
                currentWord = StringBuilder()
                withinTag = true
                result.append(char)
            }
            '>' -> {
                withinTag = false
                result.append(char)
            }
            ' ' -> {
                if (withinTag)
                    result.append(char)
                else {
                    result.append(currentWord.reversed()).append(char)
                    currentWord = StringBuilder()
                }
            }
            else -> {
                if (withinTag)
                    result.append(char)
                else
                    currentWord.append(char)
            }
        }
    }

    bw.write("${result.append("${currentWord.reversed()}")}")

    bw.close()
    br.close()
}