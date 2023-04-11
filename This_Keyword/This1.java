class Student{
    int rollno;
    String name;
    float fee;
    Student(int rollno1, String name1, float fee1){
        rollno=rollno1;
        name=name1;
        fee=fee1;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+fee+" ");
    }
}
public class This1{
    public static void main(String[] args) {
        Student s1=new Student(111,"Sourin",600);
        Student s2=new Student(112,"Ghosh",6000);
        s1.display();
        s2.display();
    }
}