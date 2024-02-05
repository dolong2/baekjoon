import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val map = mutableMapOf<String, Int>()
    repeat(n) {
        val (_, extension) = br.readLine().split(".")
        map[extension] = (map[extension] ?: 0) + 1
    }

    val result = map.toSortedMap()
    result.forEach {
        bw.write("${it.key} ${it.value}\n")
    }

    bw.close()
    br.close()
}