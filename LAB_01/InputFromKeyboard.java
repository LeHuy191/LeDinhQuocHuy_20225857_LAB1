package LAB_01;
import java.util.Scanner;
//Ex6.2: InputFromKeyboard.java
public class InputFromKeyboard{
    private static Scanner keyboard;

	public static void main(String args[]){
        keyboard = new Scanner(System.in);

        System.out.println("What's your name?");
        String strName = keyboard.nextLine();

        System.out.println("How old are you?");
        int iAge = keyboard.nextInt();

        System.out.println("How tall are you (m)?");
        double dHeight = keyboard.nextDouble();

        // similar to other data types
        // nextByte(), nextShort(), nextLong()
        // nextFloat(), nextBoolean()

        System.out.println("Mrs./Ms. " + strName + ", " + iAge + " years old. "
            + "Your height is " + dHeight + ".");
    }
}

