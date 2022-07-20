import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int age = 1 + random.nextInt(19);
        if (age < 19 && age > 9) {
            System.out.println("DA");
        } else {

            System.out.println("NET");
        }
    }
}
