import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val studentList = br.readLine().split(" ")
    val map = studentList.associateWith { 0 }.toMutableMap()
    repeat(n) {
        val preferenceList = br.readLine().split(' ')
        preferenceList.forEach {
            map[it] = map[it]!! + 1
        }
    }
    map.toList()
        .sortedByDescending { it.second }
        .forEach {
            bw.write("${it.first} ${it.second}\n") 
        }

    br.close()
    bw.close()
}