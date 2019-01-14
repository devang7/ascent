package com.ninetynineproblems.lists

/***
  * (*) Find the last but one element of a list.
  *
  * Example:
  * scala> penultimate(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 5
  */
class P02 {

  def penultimate[A](list: List[A]): A = {
    list match {
      case h :: tail => {
        tail match {
          case _ :: Nil => h
          case _ => penultimate(tail)
        }
      }
      case _ => throw new NoSuchElementException
    }
  }

  def penultimateI[A](list: List[A]): A = {
    list match {
      case h :: _ :: Nil => h
      case _ :: tail => penultimate(tail)
      case _ => throw new NoSuchElementException
    }
  }
}
