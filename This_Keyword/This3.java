class A{
    A(){
        System.out.println("Print x");
    }
    A(int x){
        this();
        System.out.println(x);

    }
}
public class This3 {
    public static void main(String[] args) {
        new A(10);
    }
}
