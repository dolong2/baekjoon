import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val map = mutableMapOf<Int, Int>()
    repeat(n) {
        val orderLine = br.readLine().split(" ").map { it.toInt() }
        val cmd = orderLine[0]
        if (cmd == 1)
            map[orderLine[2]] = orderLine[1]
        else
            bw.write("${map[orderLine[1]]}\n")
    }

    br.close()
    bw.close()
}