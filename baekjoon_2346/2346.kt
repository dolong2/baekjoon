import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.absoluteValue

class Balloon(
    val num: Int,
    val index: Int
)

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    br.readLine()
    val input = br.readLine().split(' ')

    val dq = ArrayDeque<Balloon>()
    input.forEachIndexed { index, it ->
        dq.addLast(Balloon(it.toInt(), index + 1))
    }

    while (true) {
        val targetBalloon = dq.removeFirst()
        val num = targetBalloon.num
        val index = targetBalloon.index
        print("$index ")
        if (dq.isEmpty())
            break
        if (num > 0) {
            for (i: Int in 1 until num) {
                dq.addLast(dq.removeFirst())
            }
        } else {
            for (i: Int in 1..num.absoluteValue) {
                dq.addFirst(dq.removeLast())
            }
        }
    }

    br.close()
}