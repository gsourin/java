class A{                                   //Parent Class(1)
String method(){
String name="Sourin";
}
}
class B{                                          //Parent Class(2)
String method1(){
String name="Ghosh";
}
}
class C extends A,B{   //Child Class                  : error: '{' expected
                                                    //class C extends A,B{
                 
                                                     //1 error
}
public class MultipleInhertance{
public static void main(String args[]){
C ob = new C();
Syste.out.println(ob.method());
}
}