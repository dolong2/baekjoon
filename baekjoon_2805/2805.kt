import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val (_, m) = br.readLine().split(" ").map { it.toInt() }
    val treeList = br.readLine().split(" ").map { it.toInt() }

    var (start, end) = arrayOf(0, treeList.max())
    while (start + 1 < end) {
        val mid = (start + end) / 2
        var sum: Long = 0

        treeList.forEach {
            if (it >= mid) {
                sum += (it - mid)
            }
        }

        if (sum >= m) start = mid
        else end = mid
    }

    bw.write("$start")

    bw.close()
    br.close()
}