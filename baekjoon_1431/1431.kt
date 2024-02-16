import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val set = sortedSetOf(
        compareBy<String> {it.length}
        .thenBy { it ->
            var sum = 0
            it.forEach {
                if (it.isDigit())
                    sum += (it.code - 48)
            }
            sum
        }
        .thenBy { it }
    )

    repeat(n) {
        val str = br.readLine()
        set.add(str)
    }

    bw.write("${set.joinToString("\n")}")

    br.close()
    bw.close()
}