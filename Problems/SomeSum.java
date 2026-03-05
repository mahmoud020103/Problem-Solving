import java.util.Scanner;

public class SomeSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=input.nextInt();
        int num1=input.nextInt();
        int num2=input.nextInt();
        int sum=0;
        for (int i = 0; i <= num; i++) {
            if (i <10) {
                if (i>=num1 && i <= num2) {
                    sum+=i;
                }
            }else {
                int number=i;
                int mysum=0;
                while (number!=0){
                    int mynum=number%10;
                    mysum+=mynum;
                    number/=10;
                }
                if (mysum>=num1 && mysum<= num2) {
                    sum+=i;
                }

            }
            }
        System.out.println(sum);
    }


    }

