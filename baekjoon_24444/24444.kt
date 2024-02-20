import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.SortedSet

val result = IntArray(100001)
var order = 0

fun bfs(graph: List<SortedSet<Int>>, start: Int, visited: BooleanArray) {
    val queue = ArrayDeque<Int>()
    queue.addLast(start)
    visited[start] = true

    while(queue.isNotEmpty()) {
        val poll = queue.removeFirst()
        visited[poll] = true
        result[poll] = ++order

        val child = graph[poll]
        child.forEach {
            if (!visited[it]) {
                visited[it] = true
                queue.addLast(it)
            }
        }
    }
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val (n, m, r) = br.readLine().split(" ").map { it.toInt() }
    val graph = mutableListOf<SortedSet<Int>>()
    repeat(n + 1) {
        graph.add(sortedSetOf())
    }
    repeat(m) {
        val (u, v) = br.readLine().split(" ").map { it.toInt() }
        graph[u].add(v)
        graph[v].add(u)
    }
    val visited = BooleanArray(n + 1)

    bfs(graph, r, visited)

    repeat(n) {
        bw.write("${result[it + 1]}\n")
    }

    br.close()
    bw.close()
}