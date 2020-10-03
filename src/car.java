import java.util.Scanner;

 public class car{
    public static void main(String[] args){
        int a;
        int b;
        Scanner bmw=new Scanner(System.in);
        System.out.println("enter value for a: ");
        a=bmw.nextInt();
        System.out.println("enter value for b: ");
        b=bmw.nextInt();
        int multiplication=a*b;
        int division=a/b;
        int addition=a+b;
        System.out.println("multiplication is: " +multiplication);
        System.out.println("division is: "+division);
        System.out.println("addition is : "+addition);
    }
}
