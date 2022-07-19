import scala.io.StdIn.{readLine, readInt, readFloat}

object Main {
  def value(count: Int): Double = (count * 24.95 * 0.6);
  def shipping(count: Int): Double =
    (if (count > 50) { (50 * 3) + ((count - 50) * 0.75) }
     else { 50 * 3 });
  def total(count: Int): Double = (value(count) + shipping(count));
  def main(args: Array[String]) = {
    print("Enter the number of copies: ");
    var count = readInt();
    printf("Total Cost: %.2f LKR", total(count));
  }
}
