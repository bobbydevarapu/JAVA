package JavaCoding.JavaBasic.TypeCasting;

public class Example {
  public static void main(String[] args) {
      // Implicit Typecasting (Widening) - Small to Large
      System.out.println();
      int intValue = 50;
      double doubleValue = intValue;  // Automatically converts int to double
      System.out.println("Implicit Typecasting (int to double): " + doubleValue);

      // Explicit Typecasting (Narrowing) - Large to Small
      double pi = 3.14159;
      int intPi = (int) pi;  // Explicitly casting double to int
      System.out.println("Explicit Typecasting (double to int): " + intPi);

      // Narrowing Example with Data Loss
      int largeInt = 130;
      byte smallByte = (byte) largeInt;  // Data loss occurs as byte range is -128 to 127
      System.out.println("Explicit Typecasting (int to byte with data loss): " + smallByte);

      // Implicit Typecasting in Expressions
      byte b = 40;
      short s = 100;
      int sum = b + s;  // byte and short are promoted to int automatically
      System.out.println("Implicit Typecasting in expression (byte + short to int): " + sum);

      // Casting float to int
      float floatNum = 9.75f;
      int intNum = (int) floatNum;
      System.out.println("Explicit Typecasting (float to int): " + intNum);
  }
}
