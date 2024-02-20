import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.SortedSet

val result = IntArray(100001)
var order = 0

fun dfs(graph: List<SortedSet<Int>>, start: Int, visited: BooleanArray) {
    if (visited[start])
        return
    visited[start] =  true
    result[start] = ++order
    graph[start].forEach {
        dfs(graph, it, visited)
    }
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val (n, m, r) = br.readLine().split(" ").map { it.toInt() }
    val graph = mutableListOf<SortedSet<Int>>()
    repeat(n + 1) {
        graph.add(sortedSetOf(compareByDescending{it}))
    }
    repeat(m) {
        val (u, v) = br.readLine().split(" ").map { it.toInt() }
        graph[u].add(v)
        graph[v].add(u)
    }
    val visited = BooleanArray(n + 1)

    dfs(graph, r, visited)

    repeat(n) {
        bw.write("${result[it + 1]}\n")
    }

    br.close()
    bw.close()
}