package com.ninetynineproblems.lists

/***
Find the Kth element of a list.

By convention, the first element in the list is element 0.
Example:

scala> nth(2, List(1, 1, 2, 3, 5, 8))
res0: Int = 2
*/
class P03 {
  def findKthElement[T](k: Int, x: List[T]): T = {
    if (k < 0) throw new IllegalArgumentException
  		x match {
  			case Nil => throw new NoSuchElementException
  			case head :: tail => {
  				k match {
  					case found if (k == 0) => head
  					case findMore => findKthElement(k - 1, tail)
  				}
  			}
  	  }
  }
}
