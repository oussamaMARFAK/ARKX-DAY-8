

public class Main {
    public static void main(String[] args) {
        int[] nums = { 2, 4, 6, 8, 10 };


        int divisor =0;
        int result ;

        try {
            System.out.println(nums[10]);

            result = nums[1] / divisor;

        } catch (ArithmeticException e) {

            System.err.println("ArithmeticException caught: Division by zero");
        } catch (ArrayIndexOutOfBoundsException e) {

            System.err.println("ArrayIndexOutOfBoundsException caught: Index out of bounds");
        } catch (Exception e) {

            System.err.println("Exception caught: " + e.getMessage());
        }
    }
}