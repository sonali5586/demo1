
    public class Birds {
    public  void  voice(){
        System.out.println(" all birds voice is good ");
    }

    public void eat(){
        System.out.println(" most of the birds eat grains ,fruits,small creatures");
    }
    public void fly(){
        System.out.println(" all  birds can fly high  ");
    }
    public void live(){
        System.out.println(" most of the birds live in  the nest");
    }

}
    class sparrow extends Birds{
    public void voice(){



        System.out.println (" spparrow doesn't have  sweet voice like cuckoos/koel  ");
    }
}
    class peacock extends Birds {
    public void eat() {
        System.out.println (" peacock eats insects and small creatures");
    }
}
    class parrots extends Birds{
    @Override
    public void live() {
        System.out.println(" parrot live in warm place /jungal ");

    }
}
    class flamingo extends Birds{
    @Override
    public void fly() {
        System.out.println(" all flamingo fly");

    }
}
    class sparks extends flamingo {
        @Override
        public void eat() {
            System.out.println(" baby flaming eat  bird milks ");
        }
    }

        class Both1 extends Birds {



            public static void main(String[] args) {

        peacock k=new peacock();
        flamingo j=new flamingo();
        k.eat();
        k.fly();
        j.eat();
        j.fly();
            }
        }

