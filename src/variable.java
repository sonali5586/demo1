package PACKAGE_NAME;

import java.util.Scanner;

public class variable {
    int x=40;
    static int b=40;

    public static void main(String[]args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("enter value of a: " + a);
        System.out.println("enter value of b:" + b);

        variable h=new variable();
        int total= h.x+ h.y;
        System.out.println("new total of x and y is: "+total);


    }
    int y=50;
}
