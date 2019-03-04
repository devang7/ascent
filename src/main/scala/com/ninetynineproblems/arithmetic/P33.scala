package com.ninetynineproblems.arithematic

/*
Determine whether two positive integer numbers are coprime.
Two numbers are coprime if their greatest common divisor equals 1.

scala> 35.isCoprimeTo(64)
res0: Boolean = true
*/

class P33(val value: Int) {

  def isCoprimeTo(that: P33): Boolean = {
    gcd(this.value, that.value) == 1
  }

  private def gcd(a: Int, b: Int): Int = {
    if (a == 0) b else gcd(b % a, a)
  }
}
object IntToP33Convert {
  implicit def intToClass(a: Int) = new P33(a)
}
