import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    repeat(n) {
        val message = br.readLine()
        val messageMap = mutableMapOf<Char, Int>()

        var i = 0
        while (i < message.length) {
            val currentChar = message[i]
            messageMap[currentChar] = messageMap.getOrDefault(currentChar, 0) + 1

            if (i == message.lastIndex && messageMap[currentChar]!! % 3 == 0) {
                bw.write("FAKE\n")
                return@repeat
            }

            if (messageMap[currentChar]!! % 3 == 0) {
                if (i + 1 >= message.length || currentChar != message[i + 1]) {
                    bw.write("FAKE\n")
                    return@repeat
                }

                i += 1
            }
            i += 1
        }

        bw.write("OK\n")
    }

    br.close()
    bw.close()
}