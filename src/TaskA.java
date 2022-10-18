
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("inputA&B.txt").getAbsoluteFile();
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextInt()) {
            System.out.println(scanner.nextInt() + scanner.nextInt());
        }
        scanner.close();
    }
}
