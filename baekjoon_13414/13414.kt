import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val (k, l) = br.readLine().split(" ").map { it.toInt() }
    val set = mutableSetOf<String>()
    repeat(l) {
        val student = br.readLine()
        if (set.contains(student))
            set.remove(student)
        set.add(student)
    }

    set.take(k).forEach {
        bw.write("$it\n")
    }

    bw.close()
    br.close()
}