package com.ninetynineproblems.lists

import org.scalatest._

class P03Spec extends FlatSpec with Matchers {
  "Finding the kth element" should "find the correct element" in {
    val obj = new P03
    val list = List(1, 2, 4, 6, 5)
    assertResult(2) {
      obj.findKthElement(1, list)
    }
    assertThrows[IllegalArgumentException] {
      obj.findKthElement(-1, list)
    }
    assertThrows[NoSuchElementException] {
      obj.findKthElement(10, list)
    }
  }
}
