import scala.io.StdIn.{readLine, readInt}

object Main {
  def faren(c: Double): Double = (c * 1.8 + 32);
  def main(args: Array[String]) = {
    print("Enter the Celcius Value: ");
    var far = readInt();
    println("Farenheit Value: " + faren(far));
  }
}
