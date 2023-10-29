import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Stack

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))
    val n = br.readLine().toInt()
    val stack = Stack<String>()
    repeat(n) {
        val input = br.readLine().split(' ')
        val isEmpty = stack.isEmpty()
        when(input[0]) {
            "1" -> stack.push(input[1])
            "2" -> {
                bw.write(if(stack.isEmpty()) "-1" else stack.pop())
                bw.newLine()
            }
            "3" -> {
                bw.write(stack.size.toString())
                bw.newLine()
            }
            "4" -> {
                bw.write(if (isEmpty) "1" else "0")
                bw.newLine()
            }
            "5" -> {
                bw.write(if(stack.isEmpty()) "-1" else stack.last())
                bw.newLine()
            }
        }
    }
    bw.close()
    br.close()
}
