import java.util.Scanner;

public class primezerotohundred {
    public static void main(String[]args){
        int a,i=0,count;
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter rang ");
        int range= sc.nextByte();

    for(a=2;a<=range;a++){
        count=0;
        for(i=1;i<=a;i++){
            if(a%i==0){
                count++;
            }

        }
     if (count==2)
         System.out.println(a+" ");
    }
    }
}
