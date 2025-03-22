package JavaCoding.JavaBasic.IOExample;

import java.util.Scanner;
public class exmple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        // Integer Input
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println("You entered: " + num);

        // Float Input
        System.out.print("Enter a float number: ");
        float fnum = sc.nextFloat();
        System.out.println("You entered: " + fnum);

        // Double Input
        System.out.print("Enter a double number: ");
        double dnum = sc.nextDouble();
        System.out.println("You entered: " + dnum);

        // Character Input
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.println("You entered: " + ch);

        // Boolean Input
        System.out.print("Enter true or false: ");
        boolean bool = sc.nextBoolean();
        System.out.println("You entered: " + bool);

        // Long Input
        System.out.print("Enter a long number: ");
        long lnum = sc.nextLong();
        System.out.println("You entered: " + lnum);

        // Short Input
        System.out.print("Enter a short number: ");
        short snum = sc.nextShort();
        System.out.println("You entered: " + snum);

        // Byte Input
        System.out.print("Enter a byte number: ");
        byte bnum = sc.nextByte();
        System.out.println("You entered: " + bnum);

        sc.close();
    }
}