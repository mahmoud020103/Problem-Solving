import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        System.out.println(isPalindrome(word));
    }
    public static boolean isPalindrome(String word){
        int left=0;
        int right=word.length()-1;
        while (left<right){
            if (Character.toLowerCase(word.charAt(left))!=Character.toLowerCase(word.charAt(right))){
                return false;

            }
            left++;
            right--;
        }
        return  true;

    }
}
