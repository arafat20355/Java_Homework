
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        try {
            File file = new File("Task3_Input/duomenys.txt");
            Scanner sc = new Scanner(file);

            int n = sc.nextInt();
            int negativeCount = 0;

            for (int i = 0; i < n; i++) {
                int temperature = sc.nextInt();

                if (temperature < 0) {
                    negativeCount++;
                }
            }

            if (negativeCount == 0) {
                System.out.println(
                        "No negative temperatures recorded"
                );
            } else {
                System.out.println(
                        "Negative temperature days: "
                                + negativeCount
                );
            }

            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
