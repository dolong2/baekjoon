import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    br.readLine()
    val setA = br.readLine().split(" ").toSet().sorted()
    val setB = br.readLine().split(" ").toSet()

    val subtract = setA.subtract(setB).map { it.toInt() }.sorted()

    bw.write("${subtract.size}\n")
    subtract.forEach {
        bw.write("$it ")
    }

    bw.close()
    br.close()
}