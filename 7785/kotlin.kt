import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val attendanceMap = HashMap<String,Boolean>()
    repeat(n){
        val input = br.readLine().split(' ')
        val name = input[0]
        val inOut = input[1]
        attendanceMap[name] = inOut == "enter"
        
    }
    attendanceMap
        .keys.sortedDescending()
        .forEach{
            if (attendanceMap[it]!!)
                println(it)
        }
    br.close()
}
