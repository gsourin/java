abstract class A {
    A() {
        System.out.println("A");
    }

    abstract void method();

    void D() {
        System.out.println("D");
    }
}

class B extends A {
    void method() {
        System.out.println("B");
    }
}

class C extends B {
    void method() {
        System.out.println("C");
    }
}

class E extends A {
    void method() {
        System.out.println("E");
    }
}

public class Abstraction {
    public static void main(String args[]) {
        A ob = new B();
        // System.out.println(ob.method());
        A ob1 = new C();
        A ob2 = new E();
        // System.out.println(ob.method());
        ob.method();
        ob1.method();
        ob2.method();
        ob.D();
    }
}