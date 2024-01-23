import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val queueStack = br.readLine().split(' ').map { it.toInt() }
    val elementList = br.readLine().split(' ').map { it.toInt() }.toMutableList()
    var m = br.readLine().toInt()
    val input = br.readLine().split(' ').map { it.toInt() }

    for (i: Int in n - 1 downTo 0) {
        if (m == 0) break
        if (queueStack[i] == 0) bw.write("${elementList[i]} ").run { m-- }
    }

    for (i: Int in input.indices) {
        if (m == 0) break
        bw.write("${input[i]} ")
        m--
    }

    bw.close()
    br.close()
}