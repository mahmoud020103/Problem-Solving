import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=input.nextInt();
        int n=input.nextInt();
        for (int i = 0; i < n; i++) {
            if (num%10==0){
                num=num/10;
            }else
                num--;
        }
        System.out.println(num);

    }
}