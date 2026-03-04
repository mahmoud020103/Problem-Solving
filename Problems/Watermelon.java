import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pieces = input.nextInt();
        System.out.println(watermelonPieces(pieces) ? "YES" : "NO");
    }

    public static boolean watermelonPieces(int pieces){
        return pieces % 2 == 0 && pieces > 2;
    }
}
