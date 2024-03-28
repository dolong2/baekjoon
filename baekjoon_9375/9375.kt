import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val testCase = br.readLine().toInt()

    repeat(testCase) {
        val n = br.readLine().toInt()
        var result = 1
        val map = mutableMapOf<String, Int>()
        repeat(n) {
            val (_, type) = br.readLine().toString().split(" ")
            map[type] = (map[type] ?: 0) + 1
        }
        map.forEach {
            result *= it.value + 1
        }
        result -= 1
        bw.write("${result}\n")
    }

    br.close()
    bw.close()
}