package com.hackerrank.strings

class SherlockAndAnagrams {

  /**
    * Given a string, find the number of pairs of substrings of the string that are anagrams of each other.
    * @param s
    * @return
    */
  def numAnagramSubstrings(s: String): Int = {
    val size = for(i <- s.toList.indices) yield {
      anagramaticPairs(s.toList.sliding(i + 1).map(_.mkString).toList).size
    }
    size.foldLeft(0)(_ + _)
  }

  /**
    * Given a list of strings, it returns all the anagramatic pairs.
    * For eg: list = ["AB", "BA", "AB"] => [("AB", "BA"), ("AB", "AB"), ("BA", "AB")]
    * @param list
    * @return List of anagramatic pairs
    */
  def anagramaticPairs(list: List[String]): Seq[(String, String)] = {
    val a = for (i <- list.indices) yield
      List(list(i)).zipAll(list.drop(i).tail, list(i), "").filter {
        case (s1: String, s2: String) => isAnagram(s1, s2)
        case _ => false
      }
    a.flatten
  }

  private def isAnagram(s1: String, s2: String): Boolean = s1.toList.diff(s2.toList).size == 0
}
