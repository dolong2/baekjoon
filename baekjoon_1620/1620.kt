import java.io.BufferedReader
import java.io.InputStreamReader

fun isNum(target: String): Boolean {
    val result = true

    target.forEach {
        val code = it.code
        if (code < 48 || code > 57 )
            return result.not()
    }

    return result
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val (n, m) = br.readLine().split(' ').map { it.toInt() }

    val numToName = mutableMapOf<Int, String>()
    val nameToNum = mutableMapOf<String, Int>()

    for (i: Int in 1..n) {
        val pocketMon = br.readLine()
        numToName[i] = pocketMon
        nameToNum[pocketMon] = i
    }

    for (i: Int in 1..m) {
        val problem = br.readLine()
        if (isNum(problem)) {
            val num = problem.toInt()
            bw.write("${numToName[num]!!}\n")
        }
        else {
            bw.write("${nameToNum[problem]!!}\n")
        }
    }

    bw.close()
    br.close()
}