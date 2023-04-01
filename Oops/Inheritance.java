class A {
    String name = "Sourin";
}

class B extends A {
    String name1 = "Ghosh";
}

class Inheritance {
    public static void main(String args[]) {
        B ob = new B();
        System.out.println(ob.name + " " + ob.name1);
    }
}