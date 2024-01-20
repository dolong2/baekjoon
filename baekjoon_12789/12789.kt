import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    br.readLine().toInt()
    val input = br.readLine().split(' ').map { it.toInt() }.toMutableList()

    val tmpLine = Stack<Int>()

    var target = 1
    while (tmpLine.isNotEmpty() || input.isNotEmpty()) {
        if (target == tmpLine.lastOrNull()) {
            tmpLine.pop()
            target++
        }
        else if (target == input.firstOrNull()) {
            input.removeFirst()
            target ++
        }
        else if (input.isNotEmpty() && input.first() != target) {
            tmpLine.push(input.firstOrNull())
            input.removeFirst()
        }
        else if (tmpLine.lastOrNull() != target) {
            bw.write("Sad")
            bw.close()
            br.close()
            return
        }
    }

    bw.write("Nice")

    bw.close()
    br.close()
}