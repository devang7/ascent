package com.hackerrank.strings

import org.scalatest.{FlatSpec, Matchers}

class SherlockAndAnagramsSpec extends FlatSpec with Matchers {

  "These strings" should "give us the number of substrings that can be anagrams" in {
    val obj = new SherlockAndAnagrams
    obj.numAnagramSubstrings("abba") should equal (4)
    obj.numAnagramSubstrings("abcd") should equal (0)
    obj.numAnagramSubstrings("ifailuhkqq") should equal (3)
    obj.numAnagramSubstrings("kkkk") should equal (10)
  }

  "These set of strings" should "give us back the anagramatic pairs" in {
    val obj = new SherlockAndAnagrams
    obj.anagramaticPairs(List("ab", "ba", "ab")).toList should equal (List(("ab","ba"), ("ab","ab"), ("ba", "ab")))
    obj.anagramaticPairs(List("a", "a", "b")).toList should equal (List(("a", "a")))
    obj.anagramaticPairs(List("a", "b", "c")).toList should equal (List())
  }
}
