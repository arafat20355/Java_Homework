
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        try {
            File file = new File("Task4_Input/duomenys.txt");
            Scanner sc = new Scanner(file);

            int n = sc.nextInt();
            int count = 0;

            if (n > 0) {
                int previous = sc.nextInt();

                for (int i = 1; i < n; i++) {
                    int current = sc.nextInt();

                    if (current < previous) {
                        count++;
                    }

                    previous = current;
                }
            }

            System.out.println(count);
            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
