class A{                               // Parent Class
String method(){
String name="Sourin";
return name;
}
}
class B extends A{                     //Child Class
String method1(){
String name1="Ghosh";
return name1;
}
}
public class SingleInheritance{
public static void main(String args[]){
B ob = new B();
System.out.println(ob.method()+" "+ob.method1());
}
}