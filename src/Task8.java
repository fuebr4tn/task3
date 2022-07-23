import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];
        int[] d = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }


        for (int current : a) {
            System.out.print(current + ",");
        }
        System.out.println();


        for (int i = 1; i < b.length; i++) {
            b[i - 1] = i * 2;
        }


        for (int current : b) {
            System.out.print(current + ",");
        }
        System.out.println();

        for (int i = 1; i <= c.length; i++) {
            c[i - 1] = (i * 2) - 1;
        }


        for (int current : c) {
            System.out.print(current + ",");
        }
        System.out.println();

        for (int i = 1; i < d.length; i++) {
            d[i - 1] = i * i;
        }

        for (int current : d) {
            System.out.print(current + ",");
        }
        System.out.println();

        int j = -1;

        for (int i = 1; i <= a.length; i++) {
            j = j * (-1);
            a[i - 1] = j;
        }
        for (int current : a) {
            System.out.print(current + ",");
        }
        System.out.println();

        a[0] = 1;
        int k = 1;
        for (int i = 1; i <= a.length; i++) {
            a[i - 1] = i * k;
            k = i * k;
        }


        for (int current : a) {
            System.out.print(current + ",");
        }
        System.out.println();

        for (int i = 2; i < a.length; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
    }
}