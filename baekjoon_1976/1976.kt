import java.io.BufferedReader
import java.io.InputStreamReader

fun find(set: MutableList<Int>, value: Int): Int {
    if (value == set.elementAt(value)) return value

    set[value] = find(set, set[value])
    return set[value]
}

fun union(set: MutableList<Int>, a: Int, b: Int) {
    val x = find(set, a)
    val y = find(set, b)

    set[y] = x
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    br.readLine().toInt()
    val parent = (0..n+1).toMutableList()
    repeat(n) {
        val input = br.readLine().split(" ").map { it.toInt() }

        input.forEachIndexed { index, i ->
            if (i == 1)
                union(parent, it + 1, index + 1)
        }
    }

    var root: Int = 0
    br.readLine().split(" ")
        .map { it.toInt() }
        .forEachIndexed { index, it ->
            val foundRoot = find(parent, it)
            if (index == 0) {
                root = foundRoot
                return@forEachIndexed
            }

            if (root != foundRoot) {
                bw.write("NO\n")
                br.close()
                bw.close()
                return
            }
        }

    bw.write("YES\n")

    br.close()
    bw.close()
}