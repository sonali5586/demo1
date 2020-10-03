import java.util.Scanner;

public  class JavaMethods
{


    public int display(){
        System.out.println(" indisplay");
        return 10;
    }

    void display1(){
        int val=display();
        int total=20+val;
        System.out.println("in display1 method "+total);
    }
    public int add(int a,int b){
        int c=a+b;
        return c;
    }
    public void multiplication(int a, int b){
       int x=25;
       int addResult=add(a,b);
       int multiply=x*addResult;
        System.out.println( "multiplication is  :" +multiply);
    }


    public int subtraction(int a,int b){
        int c=a-b;
        return c;
    }


        public static void main(String[] args) {
            JavaMethods j=new JavaMethods();
            j.display1();

//            int result=j.add(10,20);
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter value for a: ");
            int a=sc.nextInt();
            System.out.println("Enter value for b: ");

            int b=sc.nextInt();
            j.multiplication(a,b);
           // System.out.println(result);

            int result1=j.subtraction(a,b);
            System.out.println("Subtraction is: "+result1);

        }
    }







