package com.self.practice

object EDUAMZN {

  def main(args:Array[String]): Unit ={
  val input = Seq(3,7,1,2,8,4,5)
  //:scala.collection.immutable.Seq[Integer]
  val obj = new Prob1_FindMissingInArray()
  val result = obj.solution(input)
  print("Solution for problem 1 FindMissingInArray is: "+result)
  }

}

class Prob1_FindMissingInArray{
  def solution(arr: Seq[Int]): Int ={
    var sum = 0
    val n = arr.size + 1
    val arthSum = (n*(n+1))/2
    arr.foreach{item =>
      sum = item + sum
    }
    arthSum-sum
  }
}