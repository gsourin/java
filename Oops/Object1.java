class Student{
    String name;
    int age;
    void display(String name, int age) {
        this.name=name;
        this.age=age;
        System.out.println(name+" "+age);
    }
}
public class Object1 {
    public static void main(String[] args) {
        Student st=new Student();
        st.display("Sourin", 22);
    }
}
