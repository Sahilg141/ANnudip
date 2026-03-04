//2. Write a Java program  to implement Stack.

class Stack {

    int arr[] = new int[5];
    int top = -1;

    // Push operation
    void push(int value) {
        if(top == 4) {
            System.out.println("Stack Overflow");
        }
        else {
            top = top + 1;
            arr[top] = value;
            System.out.println(value + " inserted into stack");
        }
    }

    // Pop operation
    void pop() {
        if(top == -1) {
            System.out.println("Stack Underflow");
        }
        else {
            System.out.println(arr[top] + " deleted from stack");
            top = top - 1;
        }
    }

    // Display operation
    void display() {
        if(top == -1) {
            System.out.println("Stack is empty");
        }
        else {
            System.out.println("Stack elements are:");
            for(int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }
}

public class StackDemo {
    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.display();

        s.pop();
        s.display();
    }
}

//output

10 inserted into stack
20 inserted into stack
30 inserted into stack
Stack elements are:
30
20
10
30 deleted from stack
Stack elements are:
20
10