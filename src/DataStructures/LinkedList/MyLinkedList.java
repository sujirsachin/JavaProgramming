package DataStructures.LinkedList;

public class MyLinkedList
{
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    public int countNodes()
    {
        Node currentNode=head;
        if(head==null)
        {
            return 0;
        }
        int numberOfNodes=1;
        while (currentNode.next!=null)
        {
            currentNode=currentNode.next;
            numberOfNodes++;
        }
        return numberOfNodes;
    }
    public Node insertNode(int data)
    {
        Node node=new Node(data);
        if(head==null)
        {
            head=node;
            head.next=null;
            return head;
        }
        Node currentNode=head;
        while(currentNode.next!=null)
        {
            currentNode=currentNode.next;
        }
        currentNode.next=new Node(data);
        currentNode=currentNode.next;
        currentNode.next=null;
        return currentNode;
    }
    public Node deleteNode(int data) {
        if (head == null) {
            return null;
        }
        if(head.next==null && head.data==data)
        {
            head=null;
            return head;
        }
        Node currentNode = head;
        while(currentNode.next!=null) {
            if (currentNode.next.data == data)
            {
                currentNode.next=null;
            }
        }
        return currentNode;
    }
    public void clearLinkedList()
    {
        head=null;
    }
    public  void traverseList()
    {
        if(head==null)
        {
            System.out.println("No Data");
        }
        else
        {
            Node currentNode=head;
            while(currentNode!=null)
            {
                if(currentNode.next==null)
                {
                    System.out.print(currentNode.data);
                    currentNode=currentNode.next;
                }
                else
                {
                    System.out.print(currentNode.data+"->");
                    currentNode=currentNode.next;
                }
            }
            System.out.println("");
        }
    }
    public static void main(String args[])
    {
        MyLinkedList list=new MyLinkedList();
        list.insertNode(1);
        list.insertNode(2);
        list.insertNode(3);
        list.traverseList();
        list.deleteNode(2);
        list.deleteNode(1);
        list.deleteNode(3);
        list.traverseList();
        list.insertNode(5);
        list.insertNode(6);
        list.insertNode(7);
        list.traverseList();
        list.clearLinkedList();
        list.traverseList();
       }
}
