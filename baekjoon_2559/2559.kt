import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val input = br.readLine().split(" ").map { it.toInt() }

    var windowSum = input.take(k).sum()
    var maxSum = windowSum

    for (i in 0 until n - k) {
        windowSum = windowSum - input[i] + input[i + k]
        maxSum = maxOf(maxSum, windowSum)
    }

    bw.write("$maxSum")

    bw.close()
    br.close()
}