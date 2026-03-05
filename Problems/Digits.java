import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size=input.nextInt();
        for (int i = 0; i < size; i++) {
            int value=input.nextInt();
            while (value!=0){
                int num=value%10;
                value/=10;
                System.out.print(num+" ");
            }
            System.out.println("");

        }
    }
}