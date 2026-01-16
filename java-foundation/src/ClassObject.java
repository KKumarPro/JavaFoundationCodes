class Person{
    String name;
    int age;

    void introduce()
    {
        System.out.println("My name is "+name+" and age is "+age);
    }
}

public class ClassObject {
    public static void main(String[] args)
    {

        Person p1 = new Person();
        p1.name = "Karan";
        p1.age = 20;
        p1.introduce();

        Person p2 = new Person();
        p2.name = "Kumar";
        p2.age = 16;
        p2.introduce();

        Person p3 = new Person();
        p3.name = "Abc";
        p3.age = 19;
        p3.introduce();
    }
}
