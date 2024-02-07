import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.util.Stack

class Tower(
    val height: Int,
    val idx: Int
)

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    br.readLine().toInt()
    val stack = Stack<Tower>()
    val input = br.readLine()
        .split(" ")
        .map { it.toInt() }

    val result = StringBuilder()
    input.forEachIndexed { index, it ->
        val tower = Tower(it, index)
        while (stack.isNotEmpty()) {
            if (stack.peek().height >= tower.height) {
                result.append(stack.peek().idx + 1).append(" ")
                break
            }
            else {
                stack.pop()
            }
        }
        if (stack.empty())
            result.append("0 ")
        stack.push(tower)
    }

    bw.write("$result")

    bw.close()
    br.close()
}