package Spoj_Solution.com;

import java.util.Scanner;

public class DRNTEAGL {
    public static int square_dist(int x1, int y1, int x2, int y2) {
        return (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k=1;
        while (t-- > 0) {
            int n = sc.nextInt();
            int max = 0;
            int index = 0;
            int temp = 0;
            for (int i = 0; i < n; i++) {
                int x, y;
                x = sc.nextInt();
                y = sc.nextInt();
                temp=square_dist(0,0,x,y);
                if (temp>max){
                    max=temp;
                    index =i+1;
                }
            }
            System.out.println("Case "+k+": "+index);
            k++;
        }
    }
}
