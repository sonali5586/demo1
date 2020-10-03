


 import java.util.Scanner;

public  abstract class  BASIC {
 public abstract void addition(int a,int b);

 public abstract void subtraction(int a ,int b);

 public void multiplication( int a,int b){
     int c=a*b;
     System.out.println(" multiplication is :" +c );

 }
public void Division(int a,int b) {

  int D=a/b;
     System.out.println("Division is : "+ D);
}

}
 class Display extends BASIC{

     @Override
     public void addition( int a,int b) {
         int add=a+b;
         System.out.println(" Addition is : "+add);
     }

     @Override
     public void subtraction(int a,int b) {
         int sub=a-b;

         System.out.println("subtraction is : "+sub);
     }


 }
class Display1 {
    public static void main(String[] args) {
        Display j=new Display();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for a: ");
        int a=sc.nextInt();
        System.out.println("Enter value for b: ");

        int b=sc.nextInt();
        j.multiplication(a,b);

        j.addition(a,b);
       // j.Division(a,b);
        j.subtraction(a,b);
    }
}
