import java.io.BufferedReader
import java.io.InputStreamReader

fun permutations(list: List<Int>, n: Int): List<List<Int>> {
    val result = mutableListOf<List<Int>>()

    fun generatePermutations(currentPerm: MutableList<Int>, remaining: MutableList<Int>) {
        if (currentPerm.size == n) {
            result.add(currentPerm.toList())
            return
        }
        for (i in remaining.indices) {
            val nextPerm = mutableListOf<Int>().apply { addAll(currentPerm) }
            nextPerm.add(remaining[i])
            val nextRemaining = remaining.filterIndexed { index, _ -> index != i }.toMutableList()
            generatePermutations(nextPerm, nextRemaining)
        }
    }

    generatePermutations(mutableListOf(), list.toMutableList())
    return result
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val k = br.readLine().toInt()

    val list = mutableListOf<Int>()

    repeat(n) {
        val input = br.readLine().toInt()
        list.add(input)
    }

    val permutations = permutations(list, k)
    val cards = permutations.map {
        val sb = StringBuilder()
        it.forEach {
            sb.append(it)
        }
        sb.toString().toInt()
    }

    val result = cards.toSet().size

    bw.write("${result}\n")

    br.close()
    bw.close()
}