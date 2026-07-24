//Getter-Setter Method, also known as Encapsulation

class Myself{
    private int age;
    private String name;

    public void setAge(int a){
        age = a;
    }
    public int getAge(){
        return age;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}
public class GetterSetter {
    public static void main(String[] a){
        Myself obj = new Myself();
        obj.setAge(11);
        obj.setName("Karan");
        System.out.println(obj.getName()+" : "+obj.getAge());
    }
}
