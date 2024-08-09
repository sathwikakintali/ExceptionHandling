import java.io.*;
import java.util.Scanner;

public class CombineFiles {
    public static void main(String[] args) {
        try (Scanner scanner1 = new Scanner(new File("file1.txt"));
             Scanner scanner2 = new Scanner(new File("file2.txt"));
             PrintWriter writer = new PrintWriter(new File("combined.txt"))) {

            while (scanner1.hasNextLine()) {
                writer.println(scanner1.nextLine());
            }

            while (scanner2.hasNextLine()) {
                writer.println(scanner2.nextLine());
            }

            System.out.println("Data combined successfully!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
