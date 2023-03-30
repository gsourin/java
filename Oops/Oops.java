public class Oops{
public static void main(String args[]){
Pen p1=new Pen();
p1.setcolor("Blue");
System.out.println(p1.getcolor());
p1.setTip(5);
System.out.println(p1.getTip());
p1.setcolor("Yellow");
System.out.println(p1.getcolor());
}
}
class Pen
{
private String color;
private int tip;
String getcolor()
{
return this.color;
}
int getTip()
{
return this.tip;
}
void setcolor(String newcolor)
{
this.color=newcolor;
}
void setTip(int tip)
{

this.tip=tip;
}
}
