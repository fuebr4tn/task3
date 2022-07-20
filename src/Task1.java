
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();

        for (int i = 0; i<q; i ++) {
            for (int j = -1; j<i; j ++) {
                System.out.print("*");
            }
            {
                System.out.println(" ");
            }
        }
    }
}


