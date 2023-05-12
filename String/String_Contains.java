public class String_Contains {
    public static void main(String[] args) {
        String str="My name is Sourin Ghosh";
        System.out.println(str.contains("Sourin Ghosh"));
        if(str.contains("Sourin Ghosh")){
            System.out.println("Found: ");
        }
        else{
            System.out.println("Not Found: ");
        }
    }
}
