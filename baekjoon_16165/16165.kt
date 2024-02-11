import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.SortedSet

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val (idol, questionCount) = br.readLine().split(" ").map { it.toInt() }
    val groupToMember = mutableMapOf<String, SortedSet<String>>()
    val nameToGroup = mutableMapOf<String, String>()

    repeat(idol) {
        val group = br.readLine()
        val memberCount = br.readLine().toInt()
        repeat(memberCount) {
            val member = br.readLine()
            if (groupToMember[group] == null)
                groupToMember[group] = sortedSetOf(member)
            else
                groupToMember[group]!!.add(member)
            nameToGroup[member] = group
        }
    }

    repeat(questionCount) {
        val question = br.readLine()
        val type = br.readLine()
        when(type) {
            "1" -> {
                bw.write("${nameToGroup[question]}\n")
            }
            "0" -> {
                bw.write("${groupToMember[question]!!.joinToString("\n")}\n")
            }
        }
    }

    br.close()
    bw.close()
}