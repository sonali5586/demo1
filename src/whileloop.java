public class whileloop {

    public static void main(String[]args){
        int num=5;
        boolean Flag=false;
        int i=2;
           while (i<=(num/2))
{
if (num%i==0){

    Flag=true;
    break;
}

++i;

    }
if (!Flag)
{
    System.out.println( num+"is prime number ");

} else{
    System.out.println( num+"is not prime ");
}
}
    }
