import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        while (true) {
            try {
                System.out.print("enter a positive integer: ");
                n = Integer.parseInt(scanner.nextLine());
                if (n <= 0) {
                    System.out.println("Error: Please enter a positive integer.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: I said  enter a positive  integer.");
            }
        }

        System.out.println("the integer: " + n);
        scanner.close();
    }
}