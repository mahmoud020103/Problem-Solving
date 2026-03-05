import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=input.nextInt();
        int res=1;

        for (int i = num; i >0; i--) {
            res*=i;
        }
        if (res %2==0) System.out.println("YES");
        else System.out.println("NO");
    }
    }
