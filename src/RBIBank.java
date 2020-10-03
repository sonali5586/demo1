public class RBIBank {
    public void Loan(){
        System.out.println(" all bank gives loan");

    }
    public void interest(){
        System.out.println( "  interest rate is 9 percent" );

    }
    public void Moneysupply(){
        System.out.println(" RBI most important function is money supply ");
    }
    public void foreignexchange(){
        System.out.println(" RBI do foreign money exchange");
    }

}
class Bankofmaharashtra extends RBIBank{
    public void Loan(){
        System.out.println(" all bank gives loan");
    }



    @Override
    public void interest() {
        System.out.println(" maharashtra bank interest rate is 8percentage");

    }
}
class jaibhavani extends Bankofmaharashtra {
    @Override
    public void Loan() {
        System.out.println(" jai bhavani gives u car loan");
    }


    @Override
    public void interest() {
        System.out.println(" jai bhavani bank gives you high interest rate");
    }
}
class indirabank extends RBIBank{

    @Override
    public void foreignexchange() {
        System.out.println(" indira bank exchange rate 90rupess per doller ");
    }
}


class both extends RBIBank{


    public static void main(String[] args) {
Bankofmaharashtra sc=new Bankofmaharashtra();
indirabank tc=new indirabank();
sc.Loan();
tc.foreignexchange();
tc.interest();
sc.interest();
    }
}

