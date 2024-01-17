import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    br.readLine()
    val cardSet = br.readLine().split(' ').map { it.toInt() }.toHashSet()

    br.readLine()
    val target = br.readLine().split(' ').map { it.toInt() }

    target.forEach {
        if (it in cardSet) {
            bw.write("1 ")
        } else {
            bw.write("0 ")
        }
    }
    
    bw.close()
    br.close()
}