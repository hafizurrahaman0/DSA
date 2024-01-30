import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // Taking User Input using Scanner
        /* In order to use the object of Scanner, we need to import java.util.Scanner package.*/
        /* How to make a scanner object
            Scanner sc = new Scanner(System.in);
            sc.nextInt();
            sc.nextFloat();
            sc.nextString();
         */

        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your age: ");
        // int age = sc.nextInt();
        // System.out.println("Your age is: " + age);

        float firstNumber = sc.nextFloat();
        long secondNumber = sc.nextLong();
        float result = (firstNumber + secondNumber);
        System.out.print(result);
    }
}