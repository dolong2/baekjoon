fun main(args: Array<String>) {
    val string = readLine()!!.split("-")
    var sum = Integer.MAX_VALUE
    string.forEach{
        var temp = 0
        val addition = it.split("+")
        addition.forEach{
            temp += Integer.parseInt(it)
        }
        if(sum == Integer.MAX_VALUE)
            sum = temp
        else
            sum -= temp
    }
    println(sum)
}