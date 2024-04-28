package src.homework;

import java.util.Scanner;

public class max3no {

    public static void main(String[] args) {
        System.out.println("Enter first number");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        System.out.println("Enter third number");
        int num3 = sc.nextInt();

        int max = (num1 > num2) && (num1 > num3) ? (num1) : ((num2 > num3) && (num2 > num1) ? num2 : num3);
        System.out.println("the largest of the 3 numbers is \n"  +max);
    }
}
