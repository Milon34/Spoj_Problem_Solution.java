package Spoj_Solution.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Adding_Reversed_Numbers {
    static class RealScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }

    public static void main(String[] args) {
        RealScanner sc = new RealScanner();
        int t = sc.nextInt();
        while (t-- > 0) {
            String s1, s2;
            s1 = sc.next();
            s2 = sc.next();
            StringBuffer sb1 = new StringBuffer(s1);
            StringBuffer sb2 = new StringBuffer(s2);
            sb1.reverse();
            sb2.reverse();
            String sVal1 = String.valueOf(sb1);
            String sVal2=String.valueOf(sb2);
            int intVal1= Integer.parseInt(sVal1);
            int intVal2= Integer.parseInt(sVal2);
            int per=intVal1+intVal2;
            String perS= String.valueOf(per);
            StringBuffer persb=new StringBuffer(perS);
            persb.reverse();
            String myS= String.valueOf(persb);
            int res= Integer.parseInt(myS);
            System.out.println(res);
        }
    }
}
