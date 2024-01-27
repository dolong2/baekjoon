import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val words = mutableSetOf<String>()

    val n = br.readLine().toInt()
    for (i in 0 until n) {
        val input = br.readLine()
        words.add(input)
    }

    words
        .sortedWith(compareBy({ it.length }, { it }))
        .forEach {
            bw.write("$it\n")
        }

    bw.close()
    br.close()
}