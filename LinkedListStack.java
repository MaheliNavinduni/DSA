package dsa;

class LinkedListStack {

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node top = null;

    void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
        System.out.println(x + " pushed");
    }

    int pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    public static void main(String[] args) {
        LinkedListStack s = new LinkedListStack();
        s.push(5);
        s.push(15);
        s.push(25);
        System.out.println("Popped: " + s.pop());
    }
}

