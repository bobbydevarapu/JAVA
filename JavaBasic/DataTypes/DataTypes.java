package JavaCoding.JavaBasic.DataTypes;

public class DataTypes {
  public static void main(String[] args) {
          System.out.println();
          byte byteVar = 100;         // Range: -128 to 127
          short shortVar = 32000;     // Range: -32,768 to 32,767
          int intVar = 1000000;       // Range: -2^31 to 2^31-1
          long longVar = 10000000000L; // Large integer values, needs 'L' suffix
  
          float floatVar = 10.5f;     // Needs 'f' suffix
          double doubleVar = 99.99;   // Default decimal type
  
          char charVar = 'A';         // Stores a single character
          boolean boolVar = true;     // Stores true or false
  
          // Non-Primitive Data Type
          String stringVar = "Hello, Java!"; // String is an object, not a primitive
  
          // Display Values
          System.out.println("byte: " + byteVar);
          System.out.println("short: " + shortVar);
          System.out.println("int: " + intVar);
          System.out.println("long: " + longVar);
          System.out.println("float: " + floatVar);
          System.out.println("double: " + doubleVar);
          System.out.println("char: " + charVar);
          System.out.println("boolean: " + boolVar);
          System.out.println("String: " + stringVar);
      }
  }
