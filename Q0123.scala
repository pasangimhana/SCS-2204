object Hello {
  def main(args: Array[String]) = {
    var k, j, i = 2;
    var m, n = 5;
    var f = 12.0f;
    var g = 4.0f;
    var c = 'X';
    println("Question 01, 02, 03");
    printf("a. %d\n", k + 12 * m);
    printf("b. %d\n", m / j);
    printf("c. %d\n", n % j);
    printf("d. %d\n", m / j * j);
    printf("e. %.2f\n", f + (10 * 5) + g);
    printf("f. %d - There is no ++ operator in Scala\n", i * n);
    println("Question 03 Part 02");
    var a: Int = 2;
    var b: Int = 3;
    var c2: Int = 4; // a variable "c" was declared before
    var d: Int = 5;
    var k2: Float = 4.3f; // a varible "k" was declared before
    b += 1;
    printf("a. %d\n", b * a + c2 * d);
    d -= 1;
    printf("b. %d\n", a);
    a += 1;
    printf("c. %f\n", -2 * (g - k2) + c2);
    c2 += 1;
    printf("d. %d\n", c2);
    c2 += 1;
    c2 = c2 * a;
    a += 1;
    printf("e. %d\n", c2);
    printf("a - %d\nb - %d\nc2 -%d\nd - %d\nk - %f", a, b, c2, d, k2);

  }
}
