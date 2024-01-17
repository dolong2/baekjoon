import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val input = br.readLine()
    val set = mutableSetOf<String>()

    for (i: Int in 1 .. input.length) {
        var tmp = ""
        for (j: Int in i..input.length) {
            tmp += input[j-1]
            set.add(tmp)
        }
    }

    bw.write("${set.size}")

    bw.close()
    br.close()
}