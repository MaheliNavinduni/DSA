package dsa;

class StackQueueDequeueFriendly {

    int size = 100;
    int[] s1 = new int[size];
    int[] s2 = new int[size];
    int top1 = -1;
    int top2 = -1;

    // ENQUEUE operation (costly)
    void enqueue(int x) {
        while (top1 != -1) {
            s2[++top2] = s1[top1--];
        }

        s1[++top1] = x;

        while (top2 != -1) {
            s1[++top1] = s2[top2--];
        }

        System.out.println(x + " enqueued");
    }

    // DEQUEUE operation (easy)
    int dequeue() {
        if (top1 == -1) {
            System.out.println("Queue is empty");
            return -1;
        }
        return s1[top1--];
    }

    public static void main(String[] args) {
        StackQueueDequeueFriendly q = new StackQueueDequeueFriendly();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Dequeued: " + q.dequeue());
    }
}

