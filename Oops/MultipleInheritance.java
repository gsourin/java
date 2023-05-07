interface A { // Parent Class(1)
    void method();
}

interface B { // Parent Class(2)
    void method1();
}

class C implements A,B{   //Child Class                  : error: '{' expected
                                                    //class C extends A,B{
    public void method(){System.out.println("Sourin");}
    public void method1(){System.out.println("Ghosh");}             
                                                     //1 error
}

public class MultipleInheritance{
public static void main(String args[]){
C ob = new C();
//System.out.println(ob.method());
ob.method();
ob.method1();
}
}