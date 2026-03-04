
import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            String word = input.next();
            if (word.length() > 10) {
                System.out.println(word.charAt(0) + "" + (word.length() - 2) + word.charAt(word.length() - 1));
            } else {
                System.out.println(word);
            }
        }
    }
}