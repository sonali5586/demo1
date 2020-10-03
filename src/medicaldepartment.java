import java.util.Scanner;

public class medicaldepartment {
    public static void main(String[]args)
    {
        String  employeeName;
        int age;
        double salary;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Name,age,salary ");
        employeeName =sc.nextLine();
        age =sc.nextInt();
        salary=sc.nextDouble();
        System.out.println("employee Name "+ employeeName);
        System.out.println("employee age"+ age);
        System.out.println("employee salary "+ salary);




    }
}
