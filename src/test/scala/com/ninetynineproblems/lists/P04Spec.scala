package com.ninetynineproblems.lists

import org.scalatest._

class P04Spec extends FlatSpec with Matchers {
  "Finding the length of list" should "find the correct length" in {
    val obj = new P04
    assertResult(4) {
      val list = List(1, 2, 3, 4)
      obj.lengthOfList(list)
    }
    assertResult(0) {
      val list = List()
      obj.lengthOfList(list)
    }
  }
}
