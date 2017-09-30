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
  var CurFib, PrevFib, TmpFib = 0
  def fibonatch(x: Int): Int = {
    for (i <- 0 to x) {
      if (i == 0) CurFib = 0
      else if (i == 1) CurFib = 1
      else {
        TmpFib = CurFib + PrevFib
        PrevFib = CurFib
        CurFib = TmpFib
      }
    println(s"CurFib, PrevFib = $CurFib, $PrevFib")
    }
    CurFib
  }

  def main(args: Array[String]): Unit = {
    var msg = ""
    var x, fib = 0
    if(args.size != 1) {
      msg = "Please "
    } else {
      catching(classOf[NumberFormatException]).opt {
      x = args(0).toInt
      }
      fib = fibonatch(x)
      msg = "Fibonatch Number of %d is %d"
      msg.format(x, fib)
    }
    println(msg)
    println(x)
    println(fib)
  }
}
