import java.io.BufferedReader
import java.io.InputStreamReader

var card = IntArray(21)
val set = mutableSetOf<Int>()
var sum = 0
var N = 0

fun DFS(i: Int, num: Int) {
    set.add(num)
    if (i == N) return

    DFS(i + 1, num + card[i + 1])
    DFS(i + 1, num)
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    N = br.readLine().toInt()
    br.readLine().split(" ")
        .map { it.toInt() }
        .forEachIndexed { index, i ->
            card[index + 1] = i
            sum += i
        }
    for (i in 0 until N) {
        DFS(i, card[i])
    }

    println(sum - set.size + 1)

    br.close()
    bw.close()
}