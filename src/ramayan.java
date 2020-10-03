import java.util.Scanner;

public class ramayan {
    int m;  //instance variable
    int n;   //instance variable

    static int p=12;   //static variable
    static int q=6;     //static variable


    public static void main(String[]args) {
        int c;
        int d;
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        System.out.println(" the value of c: " + c);


        System.out.println(" enter the number");

        Scanner pc=new Scanner(System.in);
        d=pc.nextInt();
        System.out.println("the value of d: "+d);
        int multiplication=c*d;
        System.out.println("multiplication of c and d :" +multiplication);


        ramayan h= new ramayan();
        int multiplication1= (h.m*h.n)*(h.s*h.r);
        System.out.println(" the multiplication of m,n,p,q " +multiplication1);
    }
    int r; //instance variable
    int s; //instance variable



}
