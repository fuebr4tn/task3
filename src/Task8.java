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
            System.out.print(current + ", ");
        }

        for (int i = 1; i < b.length; i++) {
            b[i - 1] = i * 2;
        }


        for (int current : b) {
            System.out.print(current + ", ");
        }
        for (int i = 1; i <= c.length; i++) {
            c[i-1] = (i*2)-1;
        }


        for (int current : c) {
            System.out.print(current + ", ");
        }
        for (int i = 1; i <= d.length; i++) {
            d[i-1] = i + 1;
        }


        for (int current : d) {
            System.out.print(current + ", ");
        }
    }
}