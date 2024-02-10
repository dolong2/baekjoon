import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

val dx = intArrayOf(1, 0, -1, 0)
val dy = intArrayOf(0, 1, 0, -1)

private fun bfs(
    x: Int,
    y: Int,
    visit: Array<BooleanArray>,
    m: Int,
    n: Int,
    graph: Array<BooleanArray>,
) {
    var x1 = x
    var y1 = y
    val q: Queue<IntArray> = LinkedList()
    q.offer(intArrayOf(y1, x1))
    visit[y1][x1] = true
    while (!q.isEmpty()) {
        val poll = q.poll()
        y1 = poll[0]
        x1 = poll[1]
        for (i in 0..3) {
            val nextX: Int = x1 + dx[i]
            val nextY: Int = y1 + dy[i]
            if (nextX in 0 until m && nextY >= 0 && nextY <= n && graph[nextY][nextX] && !visit[nextY][nextX]) {
                q.offer(intArrayOf(nextY, nextX))
                visit[nextY][nextX] = true
            }
        }
    }
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val t = br.readLine().toInt()
    repeat(t) {
        val (n, m, k) = br.readLine().split(" ").map { it.toInt() }
        val graph = Array(n + 1) { BooleanArray(m + 1) { false } }
        val visit = Array(n + 1) { BooleanArray(m + 1) { false } }

        repeat(k) {
            var (x, y) = br.readLine().split(" ").map { it.toInt() }
            graph[x][y] = true
        }

        var count = 0
        repeat(n) { y ->
            repeat(m){ x ->
                if (graph[y][x] && !visit[y][x]) {
                    count++
                    bfs(x, y, visit, m, n, graph)
                }
            }
        }
        bw.write("$count\n")
    }

    br.close()
    bw.close()
}