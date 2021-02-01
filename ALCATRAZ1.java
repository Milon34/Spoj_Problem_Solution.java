package Spoj_Solution.com;

import java.util.Scanner;

public class ALCATRAZ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int sum = 0;
            char ch[] = s.toCharArray();
            for (int i = 0; i < s.length(); i++) {
                sum += ch[i] - 48;
            }
            System.out.println(sum);
        }
    }
}
