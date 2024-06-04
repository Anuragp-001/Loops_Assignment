package LoopAssingnment;

import java.util.Scanner;

public class Palindromenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int x = sc.nextInt();
        int y = 0;
        while (x != 0){
            x = x % 10;
            y = x;
            x = x/10;
        }
        if (y == x) System.out.println("Palindrome number");
        else System.out.println("Not A Palindrome");

    }
}
