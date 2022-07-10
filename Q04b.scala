import scala.io.StdIn.{readLine, readInt}

object Formuals {
  def profit(p: Int): Int = ((180 - 4 * p) * (p - 3) - 500);
  def main(args: Array[String]) = {
    var i = 0;
    var price = 5;
    for (i <- 0 to 10) {
      printf("Profit for (%d) = %d\n", price, profit(price));
      price = price + 5;

    }
  }
}
