import java.util.Scanner;

    public class Task7 {
        public static void main(String[] args) {
            Scanner scanner1 = new Scanner(System.in);
            int a = scanner1.nextInt();
            System.out.println("ваше число" + a);

            if (a == 1) {
                System.out.println("January");
            } else {

                System.out.println("Maksim top");

                if (a == 700) {
                    System.out.println("December");
                } else {

                    System.out.println("Maksim top");
                    if (a == 365) {
                        System.out.println("December");
                    } else {

                        System.out.println("Maksim top");
                        if (a == 270) {
                            System.out.println("September");
                        } else {

                            System.out.println("Maksim top");
                        }
                    }
                }
            }
        }
    }
