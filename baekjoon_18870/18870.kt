import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    br.readLine()
    val input = br.readLine().split(' ').map { it.toInt() }

    val list = input.toSet().sorted().toList()
    for (i: Int in input.indices) {
        val idx = list.binarySearch(input[i])
        bw.write("$idx ")
    }

    bw.close()
    br.close()
}