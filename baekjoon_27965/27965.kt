import java.io.BufferedReader
import java.io.InputStreamReader

fun Long.powLength(num: Long): Long {
    var length = 1L
    var value = num
    while (value > 0) {
        length *= 10
        value /= 10
    }
    return length
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val (n, k) = br.readLine().split(" ").map { it.toLong() }
    var result = 0L
    for (i in 1..n) {
        result *= (10L.powLength(i))
        result += i
        result %= k
    }

    bw.write("$result")

    br.close()
    bw.close()
}