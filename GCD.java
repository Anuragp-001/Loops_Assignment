package Assignment;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int x = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int y = sc.nextInt();
        int z = 0;
        for (int i = 1; i <= x; i++){
            if (x % i == 0 && y % i == 0){
                z = i;
            }
        }
        System.out.println(z);
    }
}
