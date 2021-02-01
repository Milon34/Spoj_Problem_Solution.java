package Spoj_Solution.com;

import java.util.Scanner;

public class STRHH {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            String s=sc.next();
            char ch[]=s.toCharArray();
            int lenHalf=s.length()/2;
            for (int i=0;i<lenHalf;i+=2){
                System.out.print(ch[i]+"");
            }
            System.out.println();
        }
    }
}
