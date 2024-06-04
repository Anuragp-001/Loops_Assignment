package LoopAssingnment;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Name : ");
        String name = sc.nextLine();
        String rev ="";
        int length = name.length();
        for (int i = length-1;i >= 0; i--){
            rev = rev + name.charAt(i);
        }
        System.out.println(rev);
        if (name.equals(rev)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not A Palindrome");
        }

    }
}
