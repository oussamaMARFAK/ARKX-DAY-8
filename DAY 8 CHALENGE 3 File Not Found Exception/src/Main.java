import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try { File blob_2_ =new File("/Users/pc/Desktop/blob _2_.txt");
            Scanner SCAN = new Scanner(blob_2_);
            System.out.println(SCAN.nextLine());
        }catch (FileNotFoundException e){
            System.out.println("there no such file");
        }
        System.out.println("NOW THE OTHER FILE");

        try { File  blob =new File("/Users/pc/Desktop/blob&.txt");
            // Open a file for reading
            Scanner SCAN = new Scanner(blob);
            System.out.println(SCAN.nextLine());
        }catch (FileNotFoundException e){
            System.out.println("there no such file");
        }
    }
}