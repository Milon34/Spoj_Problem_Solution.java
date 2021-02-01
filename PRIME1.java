package Spoj_Solution.com;

import java.util.Scanner;

public class PRIME1 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int a,b;
            a=sc.nextInt();
            b=sc.nextInt();
            for (int i=a;i<=b;i++){
                if (isPrime(i)){
                    System.out.println(i);
                }else {
                    continue;
                }
            }
            System.out.println();
        }
    }
}
