import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Take inputs
        System.out.println("ENTER THE FIRST NO.");
        int i = sc.nextInt();

        System.out.println("ENTER THE SECOND NO.");
        int j = sc.nextInt();

        System.out.println("ENTER THE Operation (+, -, *, /):");
        char ch = sc.next().charAt(0);

        // Switch operation
        switch (ch) {
            case '+': {
                int z = i + j;
                System.out.println("Result: " + z);
                break; // Ensure break to prevent fall-through
            }
            case '-': {
                int z = i - j;
                System.out.println("Result: " + z);
                break;
            }
            case '*': {
                int z = i * j;
                System.out.println("Result: " + z);
                break;
            }
            case '/': {
                if (j != 0) {
                    int z = i / j;
                    System.out.println("Result: " + z);
                } else {
                    System.out.println("Error: Division by zero is not allowed!");
                }
                break;
            }
            default:
                System.out.println("Invalid Entry");
                break;
        }

        sc.close(); // Close the scanner to free resources
    }
}
