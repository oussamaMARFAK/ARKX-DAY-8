import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = scan.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println("your number: " + number);
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException caught: Input it's not  the right integer.");
        }

        scan.close();




    }
}