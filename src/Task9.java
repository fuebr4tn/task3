
import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        int[] a = new int[10];
        Random t = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = t.nextInt(100);
            System.out.println(a[i] + " ");
        }
        System.out.println();

        int q = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > q) {
                q = a[i];
            }
        }
        int w = 100;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < w) {
                w = a[i];
            }
        }

        System.out.println("max" + q);
        System.out.println("min" + w);


        }
        }