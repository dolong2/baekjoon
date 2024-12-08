import java.io.BufferedReader
import java.io.InputStreamReader

fun Comb(n: Long): Long {
    return if (n < 2) 0L
        else n * (n - 1) / 2L
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val arr = br.readLine().split(" ").map { it.toInt() }

    val prefixSumArr = Array(n) { 0L }
    val remainPrefixSumArr = Array(n) { 0L }
    val indexCountArr = Array(m) { 0L }

    arr.forEachIndexed { index, it ->
        if (index == 0)
            prefixSumArr[index] = it.toLong()
        else
            prefixSumArr[index] = prefixSumArr[index - 1] + it

        remainPrefixSumArr[index] = (prefixSumArr[index] % m)
        indexCountArr[remainPrefixSumArr[index].toInt()]++
    }

    var sum = indexCountArr[0]
    for(i in 0 until m) {
        sum += Comb(indexCountArr[i])
    }

    bw.write("$sum")

    br.close()
    bw.close()
}