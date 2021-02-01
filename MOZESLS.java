package Spoj_Solution.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MOZESLS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int t=sc.nextInt();
        while (t-- >0){
            int a,b;
            a=sc.nextInt();
            b=sc.nextInt();
            char ch[]=s.toCharArray();
            int count=0;
            for (int i=a-1;i<b;i++){
                if (ch[i]=='s'){
                    for (int j=i;j<b;j++){
                        if (ch[j]=='m'){
                            for (int k=j;k<b;k++){
                                if (ch[k]=='s'){
                                    count++;
                                    //break;
                                }
                            }
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}
class Main{

    public static void main(String[] args) {
        ArrayList<Number> l=new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        Main.m(l);
        System.out.println();

    }
    public static void m(ArrayList<? super Integer> l){
        l.add(4);
        l.add(5);
    }
}
