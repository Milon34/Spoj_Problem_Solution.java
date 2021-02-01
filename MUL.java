package Spoj_Solution.com;

import java.math.BigInteger;
import java.util.Scanner;

public class MUL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            BigInteger a,b;
            a=sc.nextBigInteger();
            b=sc.nextBigInteger();
            //BigInteger big=BigInteger.ONE;
            System.out.println(a.multiply(b));
        }
    }
}
//class testhhhh{
//    public static void main(String[] args) {
//        int b[]={1,2,3};
//        int c[]=b;
//        c[0]+=b[2];
//        c[1]+=b[1];
//        c[2]+=b[0];
//        String[][] n=new String[1][2];
//        System.out.println(c[0]+c[1]+c[2]);
//    }
//}