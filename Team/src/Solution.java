import java.util.Scanner;

/**
 * @author nabil
 * @at 2/23/23 9:27 PM
 * @link https://codeforces.com/contest/231/problem/A
 */
public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), output = 0;
        while (n-- > 0) {
            output += input.nextInt() + input.nextInt() + input.nextInt() < 1 ? 0 : 1;
        }
        System.out.println(output);
    }
}