import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val map = mutableMapOf<String, String>()
    repeat(n) {
        val (origin, replacement) = br.readLine().split(" = ")
        map[origin] = replacement
    }

    val t = br.readLine().toInt()
    repeat(t) {
        br.readLine()
        br.readLine().split(" ").forEach {
            bw.write("${map[it]} ")
        }
        bw.write("\n")
    }

    br.close()
    bw.close()
}