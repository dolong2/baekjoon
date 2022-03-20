package main

import "fmt"


func gcd (num1 int, num2 int) int {
  if num2 == 0{
return num1
}else {return gcd(num2, num1 % num2)}
}
func main() {
  var n,m int;
  var a,b int;
  fmt.Scanf("%d %d",&n ,&m);
  fmt.Scanf("%d %d",&a ,&b);
  var l int=m*b/gcd(m,b);
  var son int=n*(l/m)+a*(l/b);
  var g int=gcd(son,l);
  fmt.Printf("%d %d \n",(son/g),(l/g));
}