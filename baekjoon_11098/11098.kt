import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    repeat(n) {
        val a = br.readLine().toInt()
        val arr = mutableListOf<Int>()
        val m = mutableMapOf<Int, String>()

        repeat(a) {
            val (numStr, str) = br.readLine().split(" ")
            val num = numStr.toInt()
            arr.add(num)
            m[num] = str
        }
        arr.sortDescending()
        bw.write("${m[arr[0]]}\n")
    }

    br.close()
    bw.close()
}