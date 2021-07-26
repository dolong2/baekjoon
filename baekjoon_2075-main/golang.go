package main

import (
  "container/heap"
	"fmt"
)
type IntHeap []int
 
func (h IntHeap) Len() int {
    return len(h)
}
 
func (h IntHeap) Less(i, j int) bool {
    return h[i] < h[j]
}
 
func (h IntHeap) Swap(i, j int) {
    h[i], h[j] = h[j], h[i]
}
 
func (h *IntHeap) Push(element interface{}) {
    *h = append(*h, element.(int))
}
 
func (h *IntHeap) Pop() interface{} {
    old := *h
    n := len(old)
    element := old[n-1]
    *h = old[0 : n-1]
    return element
}
func main() {
	var n int
  h :=&IntHeap{0}
  heap.Init(h)
  fmt.Scan(&n)
  for i:=0;i<n;i++{
    var b int
    for j:=0;j<n;j++{
      fmt.Scan(&b)
      heap.Push(h,b)
      if(h.Len()>n){
        heap.Pop(h)
      }
    }
  }
  fmt.Print(heap.Pop(h))
}
//시간초과남
