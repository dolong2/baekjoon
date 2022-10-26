import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    var br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var word :MutableList<Char> = br.readLine().toMutableList()
    var n : Int = br.readLine().toInt()
    var cursor: Int = word.size
    repeat(n){
        val orders:String = br.readLine()
        if(orders == "L" && cursor!=0){
            cursor--
        }
        else if(orders == "D" && cursor!=0){
            cursor++
        }
        else if(orders == "B" && cursor!=0){
            word.removeAt(--cursor)
        }
        else if(orders.contains("P")){
            word.add(cursor++, orders[2])
        }
    }
    bw.write(word.toCharArray())
    bw.flush()
    bw.close()
}