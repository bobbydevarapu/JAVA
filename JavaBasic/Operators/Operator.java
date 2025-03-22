package JavaCoding.javaBasic.Operators;

public class Operator{
  public static void main(String[] args) {
      int a = 10, b = 5;
      System.out.println();
      // Arithmetic Operators
      System.out.println("Addition: " + (a + b));   // 10 + 5 = 15
      System.out.println("Subtraction: " + (a - b));// 10 - 5 = 5
      System.out.println("Multiplication: " + (a * b)); // 10 * 5 = 50
      System.out.println("Division: " + (a / b));   // 10 / 5 = 2
      System.out.println("Modulus: " + (a % b));    // 10 % 5 = 0

      // Relational (Comparison) Operators
      System.out.println("a == b: " + (a == b)); // false
      System.out.println("a != b: " + (a != b)); // true
      System.out.println("a > b: " + (a > b));   // true
      System.out.println("a < b: " + (a < b));   // false

      // Logical Operators
      boolean x = true, y = false;
      System.out.println("x && y: " + (x && y)); // false
      System.out.println("x || y: " + (x || y)); // true
      System.out.println("!x: " + (!x));         // false

      // Bitwise Operators
      System.out.println("a & b: " + (a & b));   // Bitwise AND
      System.out.println("a | b: " + (a | b));   // Bitwise OR
      System.out.println("a ^ b: " + (a ^ b));   // Bitwise XOR
      System.out.println("~a: " + (~a));         // Bitwise Complement
      System.out.println("a << 2: " + (a << 2)); // Left shift
      System.out.println("a >> 2: " + (a >> 2)); // Right shift

      // Assignment Operators
      int c = 10;
      c += 5;  // c = c + 5
      System.out.println("c += 5: " + c);

      // Increment & Decrement Operators
      int d = 5;
      System.out.println("Post-increment: " + (d++)); // Uses d, then increments
      System.out.println("Pre-increment: " + (++d));  // Increments first, then uses

      // Ternary Operator
      int min = (a < b) ? a : b;
      System.out.println("Minimum value: " + min);
  }
}
