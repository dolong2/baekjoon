import java.util.LinkedList

fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val lQ = LinkedList<Char>()
    val rQ = LinkedList<Char>()

    readLine().forEach {
        lQ.add(it)
    }

    val m = readLine().toInt()

    repeat(m) {
        val next = readLine()

        when(next[0]) {
            'P' -> lQ.addLast(next[2])
            'L' -> if (lQ.isNotEmpty()) rQ.addLast(lQ.pollLast())
            'B' -> if (lQ.isNotEmpty()) lQ.pollLast()
            'D' -> if (rQ.isNotEmpty()) lQ.addLast(rQ.pollLast())
        }
    }

    while (lQ.isNotEmpty()) rQ.addLast(lQ.pollLast())
    while (rQ.isNotEmpty()) bw.append(rQ.pollLast())

    bw.flush()
    bw.close()
}