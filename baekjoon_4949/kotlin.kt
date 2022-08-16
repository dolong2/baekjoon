fun main(args: Array<String>) {

  while(true) {
    val line = readLine() ?: return
    if(line == ".") break
    val stack = java.util.Stack<Char>()
    var ans = true
    line.filter { it in "()[]" }.forEach { c ->
      if(ans) {
        when(c) {
          in "([" -> stack.push(c)
          in ")" -> if(stack.isEmpty() || stack.pop() != '(') ans = false
          in "]" -> if(stack.isEmpty() || stack.pop() != '[') ans = false
        }
      }
    }
    if(!stack.isEmpty()) ans = false
    println(if(ans) "yes" else "no")
  }
}
