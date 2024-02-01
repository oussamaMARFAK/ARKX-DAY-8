import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CustomException {
                try {
                    Scanner scan=new Scanner(System.in);
                    System.out.println("enter a number: ");
                    double userInput =  scan.nextDouble();
                    if (userInput < 0) {
                        throw new CustomException("number must be a positive  integer.");
                    }
                    System.out.println("Input is valid: " + userInput);
                } catch (CustomException e) {
                    System.err.println("Custom Exception Caught: " + e.getMessage());
                }
            }
        }


