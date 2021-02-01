package Spoj_Solution.com;

import java.util.*;

public class SBANK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt();
            TreeSet<String> tree=new TreeSet<>();
            for (int i=0;i<n+1;i++){
                tree.add(sc.nextLine());
            }
            //System.out.println(tree.size());
            //System.out.println(tree.get(tree.size()-1));
            for (String i:tree){
                System.out.println(i);
            }
            //System.out.println(tree);
        }
    }
}
