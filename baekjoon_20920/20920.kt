import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val set = mutableSetOf<String>()
    val map = mutableMapOf<String, Int>()

    repeat(n) {
        val input = br.readLine()
        if (input.length >= m) {
            map[input] = (map[input] ?: 0) + 1
            set.add(input)
        }
    }

    set
        .sortedWith (
            compareByDescending<String>
            {map[it]!!}.thenByDescending{it.length}.thenBy{it}
        )
        .forEach { bw.write("$it\n") }

    bw.close()
    br.close()
}