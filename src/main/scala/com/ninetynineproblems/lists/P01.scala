package com.ninetynineproblems.lists

/***
  * (*) Find the last element of a list.
  *
  * scala> last(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 8
  */
class P01 {
  def last[A](list: List[A]): A = {
    list match {
      case h :: Nil => h
      case _ :: t => last(t)
      case _ => throw new NoSuchElementException
    }
  }
}
