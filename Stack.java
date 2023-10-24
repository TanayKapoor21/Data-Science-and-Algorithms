import java.util.*;

class Stack {
    int top = 0; // default 0 for starting
    int[] arr;

    Stack(int cap) {
        arr = new int[cap];
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int n = sc.nextInt();
        if (top == arr.length) {
            System.out.println("Overflow, cannot enter any more values");
        } else {
            System.out.println(n + " has been inputted");
            arr[top] = n;
            top++;
        }
    }

    int pop() {
        if (top == 0) {
            System.out.println("Underflow, no numbers left to delete");
            throw new EmptyStackException();
        }
        int temp = arr[top - 1];
        top = top - 1;
        return temp;
    }

    void peep() {
        System.out.println();
        System.out.println("DISPLAYING STACK");
        if (top == 0) {
            System.out.println("STACK IS EMPTY");
        } else {
            for (int i = 0; i < top; i++) {
                System.out.println(arr[i]);
            }
            System.out.println("STACK PEEPED");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the capacity of your stack");
        int cap = sc.nextInt();
        Stack ob = new Stack(cap);

        while (true) {
            System.out.println("Hello\nEnter 1 to input\nEnter 2 to delete the top number of the array\nEnter 3 to Display\nEnter 4 to end the program");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    ob.input();
                    break;
                case 2:
                    try {
                        int pop = ob.pop();
                        System.out.println(pop + " has been deleted");
                    } catch (EmptyStackException e) {
                        System.out.println("Stack is empty. Cannot delete.");
                    }
                    break;
                case 3:
                    ob.peep();
                    break;

                case 4:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("INVALID INPUT");
            }
        }
    }
}