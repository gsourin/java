/**
 * InnerInterface3_Inheritance
 */
interface A{
    void run();
}
/**
 * InnerInterface3_Inheritance
 */
interface B extends A{
    void walk();
}
public class Interface3_Inheritance implements B{
    public void run(){System.out.println("Running: ");}
    public void walk(){System.out.println("Walking: ");}
    public static void main(String[] args) {
        Interface3_Inheritance i=new Interface3_Inheritance();
        i.run();
        i.walk();
    }
}
