package Spoj_Solution.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SERI07 {
    public static int isPrime(int n) {
        if (n == 2) {
            return 1;
        }
        if (n % 2 == 0) {
            return 0;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0){
                return 0;
            }
        }
        return 1;
    }
    public static int nextPrime(int k) {
        k++;
        if (k == 2){
            return k;
        }
        if (k % 2 == 0){
            k++;
        }
        while (isPrime(k) != 1) {
            k += 2;
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a=1,b=1,c=1;
            while (n-- > 0) {
                 a = nextPrime(c);
                 b = nextPrime(a);
                 c = nextPrime(b);
                System.out.print((a*b)+c+" ");
            }
            System.out.println();
//            List<Integer> l = new ArrayList<>();
//            for (int i = 2; i <= 10002; i++) {
//                if (isPrime(i)) {
//                    l.add(i);
//                }
//            }
//            List<Integer> primeAdd = new ArrayList<>();
//            for (int i = 0; i < 100000; i += 3) {
//                if (isPrime(i)) {
//                    primeAdd.add(i * (i + 1) + (i + 2));
//                }
//                primeAdd.add((l.get(i) * l.get(i + 1)) + l.get(i + 2));
//            }
//            System.out.println(primeAdd.size());
        }
    }
}
