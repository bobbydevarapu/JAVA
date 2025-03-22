package JavaCoding.JavaBasic.ExceptionHandling;

public class FinalBlock {
    public static void main(String[] args) {
        try {
            int num = 10 / 2;
            System.out.println("Result: " + num);
        } catch (Exception e) {
            System.out.println("Exception caught!");
        } finally {
            System.out.println("This will always execute.");
        }
    }
}
