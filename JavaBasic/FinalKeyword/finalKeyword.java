package JavaCoding.JavaBasic.FinalKeyword;

public class finalKeyword {
    public static void main(String[] args) {
        final int SPEED_LIMIT = 100;
        System.out.println();
        System.out.println("Speed Limit: " + SPEED_LIMIT);
        
        // SPEED_LIMIT = 120;  // ❌ Error: Cannot change the value of final variable
    }
}
