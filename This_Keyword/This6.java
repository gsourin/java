public class This6 {
    void m(This6 y){
        System.out.println("Print X");
    }
    void p(){
        m(this);
    }
    public static void main(String[] args) {
        This6 a=new This6();
        a.p();
    }
}
