import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    var set = mutableSetOf<String>()
    var cnt = 0

    for (i in 0 until n) {
        val str = br.readLine()
        if (str.equals("ENTER")) {
            cnt += set.size
            set = mutableSetOf()
        }
        else set.add(str)
    }

    bw.write("${set.size + cnt}")

    bw.close()
    br.close()
}