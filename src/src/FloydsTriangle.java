import java.util.Scanner;

import java.util.*;
public class FloydsTriangle {
    public static void floyds(int n) {
        int k = 0;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                k++;
                System.out.print(k);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        floyds(n);
    }
}
