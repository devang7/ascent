package com.ninetynineproblems.lists

/*
Reverse a list.

Example:
scala> reverse(List(1, 1, 2, 3, 5, 8))
res0: List[Int] = List(8, 5, 3, 2, 1, 1)
*/
class P05 {
  def reverseList[T](x: List[T]): List[T] = {
    x match {
      case Nil => Nil
      case _ => x.last :: reverseList(x.init)
    }
  }
}
