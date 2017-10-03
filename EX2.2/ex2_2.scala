import scala.util.control.Exception._

object ex2_2 {

/*
 * n=0のとき： 0
 * n=1のとき： 1
 * n=2のとき： 0 + 1 = 1
 * n=3のとき： 1 + 1 = 2
 * n=4のとき： 1 + 2 = 3
 * ・・・
 */

  def isSorted[A] (as: Array[A], ordered: (A,A) => Boolean): Boolean = {

    @annotation.tailrec
    def loop(n: Int): Boolean =
      if (n >= as.length - 1) true
      else if (ordered(as(n), as(n+1))) false
      else loop(n + 1)

    loop(0)
  }

  def main(args: Array[String]): Unit = {
    val testString1 = Array("abc", "def", "dek", "pru")
    val testString2 = Array("abc", "def", "acd", "klm")
    val testInt1 = Array(1, 3, 4, 5)
    val testInt2 = Array(1, 4, 2, 5)

    println("result of " + testString1 + " is " + isSorted(testString1, (x: String, y: String) => x > y)) 
    println("result of " + testString2 + " is " + isSorted(testString2, (x: String, y: String) => x > y)) 
    println("result of " + testInt1 + " is " + isSorted(testInt1, (x: Int, y: Int) => x > y)) 
    println("result of " + testInt2 + " is " + isSorted(testInt2, (x: Int, y: Int) => x > y)) 

    
//    val testString = List(testString1, testString2)
//    testString.foreach {
//      item => 
//        println("result of " + item + " is " + isSorted(item, (x: String, y: String) => x > y)) 
//    }
//    val testInt = List(testInt1, testInt2)
//    testInt.foreach {
//      item => 
//        println("result of " + item + " is " + isSorted(item, (x: Int, y: Int) => x > y))
//    }
  }
}
