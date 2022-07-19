import scala.io.StdIn.{readLine, readInt, readFloat}

object Main {
  def easy(dist: Int): Int = (dist * 8);
  def tempo(dist: Int): Int = (dist * 7);

  def totaltime(disteasy: Int, distempo: Int): Int =
    (easy(disteasy) + tempo(distempo));

  def main(args: Array[String]) = {
    print("KM Length traveled in easy pace (Collectively): ");
    var disteasy = readInt();
    print("KM Length traveled in tempo pace (Collectively): ");
    var distempo = readInt();

    printf("Total Running Time: %d Minutes", totaltime(disteasy, distempo));
  }
}
