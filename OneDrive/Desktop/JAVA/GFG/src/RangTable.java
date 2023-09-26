
import java.util.Scanner;

public class RangTable {

    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter a rang");
        int rang = sc.nextInt();
        for (int i = 1; i <= rang; i++) {
            System.out.println(num + "*" + i + "=" + num * i);
        }
    }

}
