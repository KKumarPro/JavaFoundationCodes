class Calculation{

    //add() method with 3 parameters
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    //add() method with 2 parameters
    public int add(int n1, int n2){
        return n1+n2;
    }
}
public class MethodOverloading {
    public static void main(String[] a){
        Calculation obj = new Calculation();
        int result;
        result =  obj.add(5,5);
        System.out.println(result);
        result = obj.add(5,5,5);
        System.out.println(result);
    }
}
