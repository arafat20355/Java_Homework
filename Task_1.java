
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter laptop price: ");
        int p = sc.nextInt();

        System.out.print("Enter current savings: ");
        int s = sc.nextInt();

        System.out.print("Enter weekly savings: ");
        int m = sc.nextInt();

        int k = 0;

        if (s >= p) {
            System.out.println("k = 0");
        } else if (m <= 0) {
            System.out.println("Cannot save enough money.");
        } else {
            while (s < p) {
                s += m;
                k++;
            }

            System.out.println("k = " + k);
        }

        sc.close();
    }
}
