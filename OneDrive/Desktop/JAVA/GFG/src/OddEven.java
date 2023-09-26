
import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        System.out.println("Enter an number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("This positive number");

        } else {
            System.out.println("This nagetive number");
        }
    }
}
