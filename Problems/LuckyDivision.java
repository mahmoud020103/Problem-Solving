import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LuckyDivision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        queue.add(4);
        queue.add(7);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (current > 1000) continue;

            if (n % current == 0) {
                System.out.println("YES");
                return;
            }

            queue.add(current * 10 + 4);
            queue.add(current * 10 + 7);
        }

        System.out.println("NO");
    }
}