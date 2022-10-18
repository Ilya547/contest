import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) throws FileNotFoundException {
        File fileIn = new File("inputA&B.txt").getAbsoluteFile();
        File fileOut = new File("outputB.txt").getAbsoluteFile();
        Scanner scanner = new Scanner(fileIn);
        PrintWriter pw = new PrintWriter(fileOut);
        while (scanner.hasNextInt()) {
            pw.println(scanner.nextInt() + scanner.nextInt());
        }
        scanner.close();
        pw.close();
    }
}
