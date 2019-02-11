package com.ninetynineproblems.lists

import org.scalatest._

class P06Spec extends FlatSpec with Matchers {
  "Checking a list in Palindrome" should "find if the list is a palindrome" {
    val obj = new P06
    assertResult(true) {
      val list = List(1, 2, 3, 2, 1)
      obj.isPalindrome(list)
    }
    assertResult(true) {
      val list = List(1, 2, 2, 1)
      obj.isPalindrome(list)
    }
    assertResult(false) {
      val list = List(1, 2, 3, 1)
      obj.isPalindrome(list)
    }
  }
}
