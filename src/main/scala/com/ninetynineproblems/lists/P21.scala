package com.ninetynineproblems.lists

/*
Insert an element at a given position into a list.

Example:
scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)
*/
class P21 {
  def insertAt[T](key: T, k: Int, x: List[T]): List[T] = {
    if (k < 0) throw new IllegalArgumentException

    x match {
      case head :: tail => {
        if (k == 0) {
          key :: x
        } else {
          head :: insertAt(key, k - 1, tail)
        }
      }
      case List() => if (k == 0) List(key) else throw new NoSuchElementException
      case _ => throw new NoSuchElementException
    }
  }
}
