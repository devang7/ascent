package com.hackerrank.strings

class MakingAnagrams {

  /**
    * Given two strings s1, s2 that may not be of the same length,
    * determine the minimum number of character deletions required to make them anagrams.
    * Any characters can be deleted from either of the strings.
    *
    * @param s1
    * @param s2
    * @return
    */
  def makingAnagrams(s1: String, s2: String): Int = {
    s1.length + s2.length - 2 * s1.toList.intersect(s2.toList).size
  }
}
