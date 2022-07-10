import scala.io.StdIn.{readLine, readInt}

object Formuals {
  def taxablesalary(x: Int, y: Int): Double = ((x * 250) + (y * 85)) * 0.88;
  def nontaxablesalary(x: Int, y: Int): Double = ((x * 250) + (y * 85));
  def main(args: Array[String]) = {
    print("Enter your normal hours: ");
    var norm = readInt();
    print("Enter your OT hours: ");
    var OT = readInt();
    if (norm < 40 && OT < 30) {
      println("Your Salary is tax free: " + nontaxablesalary(norm, OT));
    } else {
      println("Your Salary After all Taxes is " + taxablesalary(norm, OT));
    }
  }
}
