import java.io.BufferedReader
import java.io.InputStreamReader

data class Condition(val power: Int, val style: String)

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val (n, m) = br.readLine().split(" ").map { it.toInt() }

    val conditions = ArrayList<Condition>(n)
    repeat(n) {
        val (style, power) = br.readLine().split(" ")
        conditions.add(Condition(power.toInt(), style))
    }
    conditions.sortBy { it.power }

    repeat(m) {
        val power = br.readLine().toInt()
        val style = findStyle(conditions, power)
        bw.write("$style\n")
    }

    bw.close()
    br.close()
}

fun findStyle(conditions: List<Condition>, power: Int): String {
    var left = 0
    var right = conditions.size - 1
    var result = ""

    while (left <= right) {
        val mid = (left + right) / 2
        val conditionPower = conditions[mid].power

        if (conditionPower >= power) {
            result = conditions[mid].style
            right = mid - 1
        } else {
            left = mid + 1
        }
    }

    return result
}