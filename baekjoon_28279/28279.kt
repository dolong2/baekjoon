import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()

    val deq = ArrayDeque<Int>()
    for (i: Int in 0 until n) {
        val line = br.readLine().split(' ').map { it.toInt() }
        val cmd = line[0]
        when(cmd) {
            1 -> deq.addFirst(line[1])
            2 -> deq.addLast(line[1])
            3 -> bw.write("${deq.removeFirstOrNull() ?: -1}\n")
            4 -> bw.write("${deq.removeLastOrNull() ?: -1}\n")
            5 -> bw.write("${deq.size} \n")
            6 -> {
                if (deq.isEmpty())
                    bw.write("1\n")
                else
                    bw.write("0\n")
            }
            7 -> bw.write("${deq.firstOrNull() ?: -1}\n")
            8 -> bw.write("${deq.lastOrNull() ?: -1}\n")
        }
    }

    bw.close()
    br.close()
}