import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    var cnt = 0

    val car = mutableSetOf<String>()
    repeat(n) {
        car.add(br.readLine())
    }
    repeat(n) {
        val outCar = br.readLine()
        if (outCar != car.first()) cnt ++
        car.remove(outCar)
    }

    bw.write("$cnt")

    br.close()
    bw.close()
}