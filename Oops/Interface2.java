/**
 * InnerInterface2
 */
interface Draw{
    void draw();
}
class Circle implements Draw{
    public void draw(){System.out.println("Drawing Circle: ");};
}
class Rectangle implements Draw{
    public void draw(){System.out.println("Drawing Rectangle: ");}
}
public class Interface2 {
    public static void main(String[] args) {
        Draw d=new Circle();
        d.draw();
    }
}
