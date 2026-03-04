import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n = input.nextInt();
        double m=input.nextInt();
        double a=input.nextInt();
        double tiles_along_length=Math.ceil(n/a);
        double tiles_along_width=Math.ceil(m/a);
        System.out.println((long) tiles_along_width*(long) tiles_along_length);
    }
}
