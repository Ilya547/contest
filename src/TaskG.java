import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class TaskG {
    public static void main(String[] args) throws FileNotFoundException {
        File fileIn = new File("input.txt").getAbsoluteFile();
        File fileOut = new File("output.txt").getAbsoluteFile();
        Scanner scanner = new Scanner(fileIn);

        String jew = scanner.nextLine();
        String st = scanner.nextLine();
        scanner.close();
        char[] jewSort = jew.toCharArray();
        char[] stArr = st.toCharArray();
        Arrays.sort(jewSort);
        List<Character> SortJew = new ArrayList<>();
        for (int i = 0; i < jewSort.length; i++) {
            if (jewSort.length == 1) {
                SortJew.add(jewSort[i]);
            }
            for (int j = 1; j < jewSort.length; j++) {
                if (!SortJew.contains(jewSort[i])) {
                    SortJew.add(jewSort[i]);
                }
            }
        }

        int counter = 0;
        for (int i = 0; i < SortJew.size(); i++) {
            for (int j = 0; j < st.length(); j++) {
                if (SortJew.get(i) == stArr[j]) {
                    counter++;
                }
            }
        }
        PrintWriter pw = new PrintWriter(fileOut);
        pw.println(counter);
        pw.close();
    }
}
