class A { // Parent Class
    String method() {
        String name = "Mr.";
        return name;
    }
}

class B extends A { // Child Class(1)
    String method1() {
        String name1 = "Sourin";
        return name1;
    }
}

class C extends A { // Child Class(2)
    String method2() {
        String name2 = "Ghosh";
        return name2;
    }
}

public class HierarchicalInheritance {
    public static void main(String args[]) {
        B ob = new B();
        C ob1 = new C();
        System.out.println(ob.method() + " " + ob.method1());
        System.out.println(ob1.method() + " " + ob1.method2());
    }
}