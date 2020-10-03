public  abstract class Animal1{

public abstract void animalSound();

public void sleep()
{
    System.out.println(" zzz");

}
}

class pig extends Animal1{
    public void animalSound(){

        System.out.println(" The pig says: wee wee");
    }
}
class display{
    public static void main(String[] args) {

        pig sc=new pig();
        sc.animalSound();
        sc.sleep();
    }
}



