import java.util.Scanner;

class Node
{
    int data; // data part
    Node next;  // address part

    Node(int value)
    {
        this.data = value;  // access the data part of current node object
    } 
}

public class DynamicStack
{
    static Node push(int value, Node head)
    {
        Node newNode = new Node(value);
        if (head == null)
        {
            head = newNode;
        }
        else
        {
            newNode.next = head;
            head = newNode;
        }
        return head;
    }

    static Node pop(Node head)
    {
        if (head == null)
        {

            System.out.println("STACKUNDERFLOW.");
        }
        else
        {
            System.out.println(head.data+ " popped");
            Node temp = head;
            head = head.next;
            temp.next = null;
            temp = null;
        }
        return head;
    }
    static void peep(Node head)
    {
        if (head ==null)
        {
            System.out.println("STACK UNDERFLOW");
            return;
        }
        Node temp = head;
        // System.out.println("PEEPING STACK");
        System.out.println("----------------------------");
        while (temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("----------------------------");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Node head = null;

        while (true)
        {

            System.out.println("Dynamic Stack:");
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. PEEP");
            System.out.println("4. EXIT");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value to push: ");
                    int value = sc.nextInt();
                    head = push(value,head);
                    break;
                case 2:
                    System.out.print("Popping a value: ");
                    head = pop(head);
                    break;
                
                case 3: 
                    System.out.println("PEEPING stack: ");
                    peep(head);
                    break;
                case 4:
                    System.out.print("Exiting loop: ");
                    sc.close();
                    System.exit(0);
                    break;
                
            }

        }
    }
}

