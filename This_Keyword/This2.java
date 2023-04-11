class A{
    void m(){
        System.out.println("Print M");
    }
    void n(){
        System.out.println("Print N");
        m();
    }
}
public class This2 {
    public static void main(String[] args) {
        new A().n();
    }
}
