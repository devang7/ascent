package com.ninetynineproblems.lists

/*
Remove the Kth element from a list.

Return the list and the removed element in a Tuple. Elements are numbered from 0.
Example:

scala> removeAt(1, List('a, 'b, 'c, 'd))
res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)
*/
class P20 {

  def removeAt[T](k: Int, x: List[T]): (List[T], T) = {
    if (k < 0) {
      throw new IllegalArgumentException
    }
    x match {
      case head :: tail => if (k == 0) {
        (tail, head)
      } else {
        val (list, removed) = removeAt(k - 1, tail)
        (head :: list, removed)
      }
      case _ => throw new NoSuchElementException
    }
  }
}
