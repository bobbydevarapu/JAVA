package JavaCoding.JavaBasic.StringOpeartions;

public class Operation {
  public static void main(String[] args) {
      // Creating Strings
      String str1 = "Hello";
      String str2 = " World";
      String str3 = "Java Programming";

      System.out.println();
      // 1. Concatenation
      String result = str1 + str2;
      System.out.println("Concatenation: " + result);

      // 2. String Length
      System.out.println("Length of str3: " + str3.length());

      // 3. Convert to Upper and Lower Case
      System.out.println("Uppercase: " + str3.toUpperCase());
      System.out.println("Lowercase: " + str3.toLowerCase());

      // 4. Checking if String Contains a Word
      System.out.println("Contains 'Java': " + str3.contains("Java"));

      // 5. Checking if String Starts or Ends with a Specific Word
      System.out.println("Starts with 'Java': " + str3.startsWith("Java"));
      System.out.println("Ends with 'ing': " + str3.endsWith("ing"));

      // 6. Extracting a Substring
      System.out.println("Substring (0 to 4): " + str3.substring(0, 4));

      // 7. Finding Index of a Character or Substring
      System.out.println("Index of 'P': " + str3.indexOf("P"));

      // 8. Replacing Characters or Words
      System.out.println("Replacing 'Java' with 'Python': " + str3.replace("Java", "Python"));

      // 9. Checking Equality of Strings
      String str4 = "hello";
      System.out.println("str1 equals str4 (case-sensitive): " + str1.equals(str4));
      System.out.println("str1 equalsIgnoreCase str4: " + str1.equalsIgnoreCase(str4));

      // 10. Splitting a String
      String sentence = "Java,Python,C++,JavaScript";
      String[] languages = sentence.split(",");
      System.out.println("Split string: ");
      for (String lang : languages) {
          System.out.println(lang);
      }

      // 11. Trimming Whitespaces
      String str5 = "   Trim me   ";
      System.out.println("Before trim: '" + str5 + "'");
      System.out.println("After trim: '" + str5.trim() + "'");
  }
}
