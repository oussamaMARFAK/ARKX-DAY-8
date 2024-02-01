import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try { File blob_2_ =new File("/Users/pc/Desktop/blob _2_.txt");
            Scanner SCAN = new Scanner(blob_2_);
            while (SCAN.hasNextLine()){
                System.out.println(SCAN.nextLine());}
        }catch (FileNotFoundException e){
            System.out.println("there no such file");
        }catch (IOException e){
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
    }
