public class LinkedList1 {

    
    //Create A New Node
    public static class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //Node Addtion

    //At First Position

    public void addFirst(int data)
    {
        //Step1: Create A Node
        Node newNode=new Node(data);
        size++;

        //If One Node Is Present
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        //Step2: newNode next=head
        newNode.next=head;
        //Step3: head=newNode
        head=newNode;        
    }

    //Add Last Position

    public void addLast(int data)
    {
        //Create A New Node
        Node newNode=new Node(data);
        size++;
        //If No Node Is Present
        if(head==null)
        {
            head=tail=newNode;
            return;
        }

        //Step2: tail next=newNode
        tail.next=newNode;
        //Step3: tail=newNode
        tail=newNode;
    }

    //Print LinkedList
    public void print()
    {
        if(head==null)
        {
            System.out.println("LinkedList Is Empty:");
            return;
        }
        Node temp=head;
        while (temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;   
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList1 ll=new LinkedList1();
        ll.addFirst(5);
        ll.addFirst(10);
        ll.addLast(4);
        ll.addLast(8);
        ll.print();
        System.out.println("LinkedList size: "+ll.size);
    }
}
