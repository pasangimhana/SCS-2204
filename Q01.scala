import scala.io.StdIn.{readLine, readInt}

object Main {
  def area(r: Int): Double = (math.Pi * r * r);
  def main(args: Array[String]) = {
    print("Enter the radius: ");
    var rad = readInt();
    println("Area of the disk: " + area(rad));
  }
}
