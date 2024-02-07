import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    var n = br.readLine().toInt()
    val result = StringBuilder()

    if (n == 0) {
        bw.write("0")
        bw.close()
        br.close()
        return
    }

    while (n != 0) {
        var remainder = n % -2
        n /= -2

        if (remainder < 0) {
            remainder += 2
            n++
        }

        result.append(remainder.toString())
    }

    bw.write("${result.reversed()}")

    bw.close()
    br.close()
}