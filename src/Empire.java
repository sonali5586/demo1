import java.util.Scanner;

public class Empire {
    int X = 40;  // Instance variable


    static int p = 70; //static variable
    static int q = 80;


    public static void main(String[] args) {
        int a; //local variables
        int b;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a ");
        a = sc.nextInt();
        System.out.println("enter value of b ");
        b = sc.nextInt();
        int total = a + b;
        System.out.println("enter total is : " + total);


        Empire e = new Empire();
        int total1 = e.X + e.y;
        System.out.println("new total of x and y is :" + total1);


        int total2 = Empire.p + Empire.q;   //static variable total(direct)


    }
    int y=45;

}
