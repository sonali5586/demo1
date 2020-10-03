import java.util.Scanner;

public class primeapend {

    public static void main(String[]args){
        int num=5,i=0;
        boolean flag=false;


        for (i=2;i<=(num/2);i++){
            if(num%i==0){
                flag=true;
                break;
            }
        }
        if (!flag){
            System.out.println(i);

        }else{
            System.out.println();
        }

    }
}
