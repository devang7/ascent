package com.ninetynineproblems.lists

import org.scalatest._

class P05Spec extends FlatSpec with Matchers {
  "Reversing a list" should "reverse the list" in {
    val obj = new P05
    assertResult(List(3, 2, 1)) {
      val list = List(1, 2, 3)
      obj.reverseList(list)
    }
    assertResult(List()) {
      val list = List()
      obj.reverseList(list)
    }
  }
}
