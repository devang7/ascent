package com.hackerrank.strings

import org.scalatest.FlatSpec

class MakingAnagramsSpec extends FlatSpec {

  "Making Anagrams problem" should "pass these tests" in {
    val obj = new MakingAnagrams
    assert(obj.makingAnagrams("abc", "cde").equals(4))
    assert(obj.makingAnagrams("abc", "amnop").equals(6))
    assert(obj.makingAnagrams("", "a").equals(1))
    assert(obj.makingAnagrams("b", "a").equals(2))
    assert(obj.makingAnagrams("absdjkvuahdakejfnfauhdsaavasdlkj", "djfladfhiawasdkjvalskufhafablsdkashlahdfa").equals(19))
  }
}