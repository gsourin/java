class Operation {
    int side1;
    int side2;
    int side3;
    int s;
    Operation(){
        side1=3;
        side2=4;
        side3=5;
        s=(side1+side2+side3)/2;
    }
        void area(){System.out.println("Area is:"+(Math.sqrt(s*(s-side1)*(s-side2)*(s-side3))));}
        void perimeter(){System.out.println("Perimeter is: "+(side1+side2+side3));}
}
public class Triangle{
    public static void main(String[] args) {
        Operation t=new Operation();
        t.area();
        t.perimeter();
    }
}
