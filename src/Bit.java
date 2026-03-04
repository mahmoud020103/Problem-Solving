import java.util.Locale;
import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String bit;
        int num=0;
        for (int i = 0; i < n; i++) {
            bit=input.next();

            if (bit.contains("++"))
                num++;
            else if (bit.contains("--"))
                num--;
            else
                System.out.println("you entered wrong var");
        }
        System.out.println(num);
    }
}
