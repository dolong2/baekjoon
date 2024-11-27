import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val str = br.readLine()

    val prefixSumArr = Array(26) { Array(str.length + 1) { 0 } }

    repeat(str.length) {
        if (it == 0)
            prefixSumArr[str[it].code - 97][it] += 1
        else {
            repeat(prefixSumArr.size) { index ->
                prefixSumArr[index][it] = prefixSumArr[index][it - 1]
            }
            prefixSumArr[str[it].code - 97][it] += 1
        }
    }



    val n = br.readLine().toInt()
    repeat(n) {
        val input = br.readLine().split(" ")
        val target = input[0].toCharArray()[0]
        val r1 = input[1].toInt()
        val r2 = input[2].toInt()

        val result =
            if (r1 == 0)
                prefixSumArr[target.code - 97][r2]
            else
                prefixSumArr[target.code - 97][r2] - prefixSumArr[target.code - 97][r1 - 1]
        bw.write("$result\n")
    }

    br.close()
    bw.close()
}