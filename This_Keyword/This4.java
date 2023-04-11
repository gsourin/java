class A{
    A(){
        this(5);
        System.out.println("Print X");
    }
    A(int x){
        System.out.println(x);
    }
}
    
public class This4 {
    public static void main(String[] args) {
        new A();
    }
}
