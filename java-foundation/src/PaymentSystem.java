public class PaymentSystem {
    public static void main(String[] a){
        UPI upi = new UPI();
        upi.pay();
        CreditCard cc = new CreditCard();
        cc.pay();
        NetBanking nb = new NetBanking();
        nb.pay();
    }
}
interface Payment
{
    void pay();
}
class UPI implements Payment
{
    @Override
    public void pay() {
        System.out.println("UPI Payment");
    }
}
class CreditCard implements Payment
{
    @Override
    public void pay(){
        System.out.println("Credit Card Payment");
    }
}
class NetBanking implements Payment
{
    @Override
    public void pay(){
        System.out.println("Net Banking");
    }
}