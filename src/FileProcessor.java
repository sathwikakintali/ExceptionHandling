import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class FileProcessor {
    public void processFiles(List<String> filePaths) {
        for (String filePath : filePaths) {
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    // Process each line (e.g., print or perform other operations)
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("Error reading file: " + filePath);
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // Example usage: Provide a list of file paths
        List<String> filePaths = List.of("file1.txt", "file2.txt", "file3.txt");
        FileProcessor fileProcessor = new FileProcessor();
        fileProcessor.processFiles(filePaths);
    }
}
