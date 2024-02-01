import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()

    val map = mutableMapOf<Long, Long>()
    var maxFrequency = 0L
    var result = Long.MAX_VALUE

    repeat(n) {
        val input = br.readLine().toLong()
        val count = (map[input] ?: 0) + 1
        map[input] = count

        if (count > maxFrequency || (count == maxFrequency && input < result)) {
            maxFrequency = count
            result = input
        }
    }

    bw.write("$result")

    bw.close()
    br.close()
}