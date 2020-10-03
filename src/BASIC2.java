public interface  BASIC2 {
    public void addition(int a,int b);

    public void subtraction(int a,int b);
}

class test implements BASIC2{

    @Override
    public void addition(int a,int b) {
        int add=a+b;
        System.out.println(" addition is : "+add);

    }

    @Override
    public void subtraction(int a,int b) {
        int sub = a - b;
        System.out.println("subtraction is : " + sub);
    }

public void multiplication(int a,int b){
       int multi=a*b;
    System.out.println(" multiplication is: "+ multi);
}
    }
    class test2 implements BASIC2{

        @Override
        public void addition(int a, int b) {
            int add=a+b;
            System.out.println(" addition is: "+add);

        }

        @Override
        public void subtraction(int a, int b) {
            int sub=a-b;
            System.out.println(" subtraction is : "+sub);

        }

        public void Division(int a,int b){
            int D=a/b;
            System.out.println(" Division is : "+D);
        }

    }


  class MainCheack{
      public static void main(String[] args) {
          BASIC2 sc=new test();
        sc.addition(10,20) ;
        sc.subtraction(10,20);

      }


  }

