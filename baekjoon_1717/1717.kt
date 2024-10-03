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

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val parent = (0..n+1).toMutableList()
    repeat(m) {
        val input = br.readLine().split(" ").map { it.toInt() }
        val cmd = input[0]
        val (a, b) = input[1] to input[2]
        when (cmd) {
            0 -> {
                union(parent, a, b)
            }
            1 -> {
                if (find(parent, a) == find(parent, b))
                    bw.write("YES\n")
                else
                    bw.write("NO\n")
            }
        }
    }

    br.close()
    bw.close()
}