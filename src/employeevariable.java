import java.util.Scanner;

public class employeevariable {


    int a=10;
    int b=20;

    static int m=60;
    static int n=20;

    public static void main (String[]args)
    {
        int c;
        int d;
        System.out.println("enter the number");
        Scanner sc =new Scanner(System.in);
        c= sc.nextInt();
        System.out.println(" the value of c: "+c);


        System.out.println(" enter the number");

        Scanner pc=new Scanner(System.in);
        d=pc.nextInt();
        System.out.println("the value of d: "+d);
         int total1=c+d;
        System.out.println("total of c and d :" +total1);


        employeevariable h=new employeevariable();
        int total2 =h.a+h.b+h.c+h.d;
        System.out.println("new total of a,b,c,d is: " +total2);


    }

    int c=45;
    int d=55;
}
