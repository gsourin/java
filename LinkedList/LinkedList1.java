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

    //Add Middle

    public void addMiddle(int idx,int data)
    {
        //If One Node Is Presnt
        if(idx==0)
        {
            addFirst(data);
            return;
        }

        //Create A New Node
        Node newNode= new Node(data);
        size++;

        Node temp=head;
        int i=0;
        while (i<idx-1)
        {
            temp=temp.next;
            i++;
        }

        //i=idx-1 ; temp->prev
        newNode.next=temp.next;
        temp.next=newNode;

    }

    //Remove First

    public int removeFirst()
    {
        if(size==0)
        {
            System.out.println("Linked List Is Empty: ");
            return Integer.MIN_VALUE;
        }

        else if(size==1)
        {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        else
        {
            int val=head.data;
            head=head.next;
            size--;
            return val;
        }
        
    }

    //Remove At Last
    public int removeLast()
    {
      if(size==0)
        {
            System.out.println("Linked List Is Empty: ");
            return Integer.MIN_VALUE;
        }

        else if(size==1)
        {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        else
        {
        //prev; i=size-2
        Node prev=head;
        for(int i=0;i<size-2;i++)
        {
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
        }
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
        ll.addMiddle(1,6);
        ll.print();
        System.out.println("LinkedList size: "+ll.size);
        ll.removeFirst();
        ll.print();
        System.out.println("After Removing Size: "+ll.size);
        ll.removeLast();
        ll.print();
        System.out.println("After Removing Size: "+ll.size);
    }
}
