import java.util.ArrayList;    //Import ArrayList Package
import java.util.Collections;   //Import Collection Package

public class BasicProgram {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();    //Defined Integer List

        //Add Elements
        list.add(0);
        list.add(2);
        list.add(4);

        System.out.println("After Adding: "+list);
        System.out.println();

        //Get Elements
        int element=list.get(0);

        System.out.println("After Getting: "+element);
        System.out.println();

        //Add Elements In Between
        list.add(1,1);

        System.out.println("After Adding In Between: "+list);
        System.out.println();

        //Set Elements
        list.set(0,5);

        System.out.println("After Setting: "+list);
        System.out.println();

        //Delete Elements | Remove Elements
        list.remove(2);

        System.out.println("After Removing: "+list);
        System.out.println();

        //Size Of ArrayList
        int size=list.size();

        System.out.println("Size Of ArrayList: "+size);
        System.out.println();

        //Loops

        //for Loop
        System.out.println("For Loop: ");
        for(int i=0; i<list.size(); i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println();

        //Sorting
        Collections.sort(list);

        System.out.println("After Sorting: "+list);
    }
}
