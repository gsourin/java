/**
 * InnerInterface4
 */
interface A{
    void A();
    void B();
    void C();
    void D();
}
abstract class B implements A{
    public void C(){System.out.println("I am C: ");}
}
class C extends B{
    public void A(){System.out.println("I am A: ");}
    public void B(){System.out.println("I am B: ");}
    public void D(){System.out.println("I am D: ");}
}
public class Interface4 {
    public static void main(String[] args) {
        C c=new C();
        c.A();
        c.B();
        c.C();
        c.D();
    }
}
