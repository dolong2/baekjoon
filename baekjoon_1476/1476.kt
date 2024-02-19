import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val (targetE, targetS, targetM) = br.readLine().split(" ").map { it.toInt() }
    var result = 1

    var earth = 1
    var sun = 1
    var moon = 1
    while (true) {
        if (earth == targetE && sun == targetS && moon == targetM) break

        if (earth++ == 15) earth = 1
        if (sun++ == 28) sun = 1
        if (moon++ == 19) moon = 1
        result++
    }

    bw.write("$result")

    br.close()
    bw.close()
}