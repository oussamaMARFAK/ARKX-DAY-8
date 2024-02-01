public class Main {

            public static void main(String args[])
            {
                try{
                    int[] numbers = { 1, 2, 3, 4, 5 };

                    System.out.println(numbers[10]);
                    int a[]=new int[10];
                    a[11] = 9;


                }
                catch(ArrayIndexOutOfBoundsException e){

                    System.out.println ("ArrayIndexOutOfBounds Exception occurred");
                            System.out.println ("System Message: "+e);


                    System.err.println("ArrayIndexOutOfBoundsException caught: Index out of bounds");
                }
            }
        }
