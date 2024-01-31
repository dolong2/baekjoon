import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val map = mutableMapOf<String, Boolean>()
    repeat(n) {
        val (p1, p2) = br.readLine().split(" ")

        if (p1 == "ChongChong") map[p1] = true
        if (p2 == "ChongChong") map[p2] = true
        if (map[p1] == null) map[p1] = false
        if (map[p2] == null) map[p2] = false

        if (map[p1]!! && !map[p2]!!) map[p2] = map[p1]!!
        if (map[p2]!! && !map[p1]!!) map[p1] = map[p2]!!
    }

    bw.write("${map.filter { it.value }.size}")


    bw.close()
    br.close()
}