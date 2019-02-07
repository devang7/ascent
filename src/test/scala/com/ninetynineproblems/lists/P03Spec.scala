package com.ninetynineproblems.lists

import org.scalatest._

class P03Spec extends FlatSpec with Matchers {
  "Finding the kth element" should "find the correct element" in {
    val obj = new P03
    val list = List(1, 2, 4, 6, 5)
    assertResult(2) {                         // regular test
      obj.findKthElement(1, list)
    }
    assertThrows[IllegalArgumentException] {  // under flow
      obj.findKthElement(-1, list)
    }
    assertThrows[NoSuchElementException] {    // over flow
      obj.findKthElement(10, list)
    }
    assertResult(1) {                         // first element
      obj.findKthElement(0, List(1))
    }
    assertResult(3) {                         // last element
      obj.findKthElement(2, List(1, 2, 3))
    }
  }
}
