class A{                                       //Parent Class
String method(){
String name="Mr.";
return name;
}
}
class B extends A{                            //Child Class
String method1(){
String name1="Sourin";
return name1;
}
}
class C extends B{                           //Grand Child Class
String method2(){
String name2="Ghosh";
return name2;
}
}
public class MultiLevelInheritance{
public static void main(String args[]){
C ob = new C();
System.out.println(ob.method()+" "+ob.method1()+" "+ob.method2());
}
}