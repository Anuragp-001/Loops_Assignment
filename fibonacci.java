package LoopAssingnment;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The N th Series : ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.println(a + "\n" +b);
        for (int i = 2; i < n;i++){
            int c = a+b;
            System.out.println(c);
            a = b;
            b = c;

        }
    }
}
