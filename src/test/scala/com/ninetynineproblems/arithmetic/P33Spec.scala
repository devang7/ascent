package com.ninetynineproblems.arithematic

import org.scalatest._

class P33Spec {
  "Two coprime numbers" should "return true" {
    import com.ninetynineproblems.arithematic.IntToP33Convert._
    assert(35.isCoprimeTo(64))
  }
}
