import scala.io.StdIn.{readLine, readInt, readFloat}

object Main {
  def volume(r: Double): Double = (4.0 / 3.0 * math.Pi * r * r * r);
  def main(args: Array[String]) = {
    print("Enter the radius: ");
    var rad = readFloat();
    println("Volume of the sphere: " + volume(rad));
  }
}
