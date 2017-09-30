import scala.util.control.Exception._

object ex2_1 {

/*
 * n=0のとき： 0
 * n=1のとき： 1
 * n=2のとき： 0 + 1 = 1
 * n=3のとき： 1 + 1 = 2
 * n=4のとき： 1 + 2 = 3
 * ・・・
 */

  def cal_fib(n: Int): Int = {

    var x = 0
    var y = 1
    var fib = 0

    def cal_fib_loop(n: Int, x: Int, y: Int): Int = {
      if(n == 0) {
        fib = x
      } else {
        fib = cal_fib_loop(n-1, y, x + y)
      }
      fib
    }

    fib = cal_fib_loop(n, 0, 1)
    fib
  }

  def main(args: Array[String]): Unit = {
    var n, fib = 0
    if(args.size != 1) {
      print("This script need a argument")
    } else {
      catching(classOf[NumberFormatException]).opt {
      n = args(0).toInt
      }
      fib = cal_fib(n)
    }
    val msg = "Fibonatch Number of %d is %d"
    println(msg.format(n, fib))
  }
}
