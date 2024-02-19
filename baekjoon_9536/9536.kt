import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    repeat(n) {
        val soundList = br.readLine().split(" ")
        val soundSet = soundList.toMutableSet()
        while (true) {
            val input = br.readLine()
            if (input == "what does the fox say?") break
            val (_, sound) = input.split(" goes ")
            soundSet.remove(sound)
        }
        bw.write("${
            soundList
                .filter { soundSet.contains(it) }
                .joinToString(" ")
        }\n")
    }

    br.close()
    bw.close()
}