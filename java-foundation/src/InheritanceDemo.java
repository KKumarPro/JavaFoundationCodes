interface A { default void showA(){ System.out.println("A"); } }
interface B { default void showB(){ System.out.println("B"); } }

// Base class
class Base {
    void base(){ System.out.println("Base"); }
}

// Single + Multilevel inheritance
class Child1 extends Base {
    void child1(){ System.out.println("Child1"); }
}

class Child2 extends Child1 {  // Multilevel
    void child2(){ System.out.println("Child2"); }
}

// Hierarchical inheritance
class Child3 extends Base {
    void child3(){ System.out.println("Child3"); }
}

// Multiple inheritance via interfaces
class Multi extends Child2 implements A, B {
    void display(){
        base(); child1(); child2();
        showA(); showB();
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Multi m = new Multi();
        m.display();

        Child3 h = new Child3(); // hierarchical example
        h.base();
        h.child3();
    }
}