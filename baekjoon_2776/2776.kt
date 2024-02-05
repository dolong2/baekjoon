import java.io.BufferedReader
import java.io.InputStreamReader

fun find(list: List<Int>, target: Int): Int {
    var start = 0
    var end = list.size - 1
    while (start <= end) {
        var mid = (start + end) / 2
        if (list[mid] == target) return 1
        else if (list[mid] < target) start = mid + 1
        else end = mid - 1
    }
    return 0
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val t = br.readLine().toInt()
    repeat(t) {
        br.readLine()
        val input = br.readLine().split(" ").map { it.toInt() }.sorted()
        br.readLine()
        val target = br.readLine().split(" ").map { it.toInt() }
        target.forEach {
            bw.write("${find(input, it)}\n")
        }
    }

    bw.close()
    br.close()
}