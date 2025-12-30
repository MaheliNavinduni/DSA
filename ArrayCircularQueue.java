package dsa;

class ArrayCircularQueue {

    int size = 5;
    int[] queue = new int[size];
    int front = -1, rear = -1;

    void enqueue(int x) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue is full");
            return;
        }

        if (front == -1)
            front = 0;

        rear = (rear + 1) % size;
        queue[rear] = x;
        System.out.println(x + " enqueued");
    }

    int dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return -1;
        }

        int value = queue[front];

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }

        return value;
    }

    public static void main(String[] args) {
        ArrayCircularQueue q = new ArrayCircularQueue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println("Dequeued: " + q.dequeue());
    }
}
