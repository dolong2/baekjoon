import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val map = sortedMapOf<String, Int>()
    var total = 0
    while (true) {
        val tree = br.readLine() ?: break
        if (tree == "exit") break
        map[tree] = (map[tree] ?: 0) + 1
        total++
    }
    map.forEach {
        bw.write("${it.key} ${String.format("%.4f", it.value.toDouble() / total * 100)}\n")
    }

    br.close()
    bw.close()
}