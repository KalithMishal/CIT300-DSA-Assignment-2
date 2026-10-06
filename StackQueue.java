public class StackQueue {

    // =========================
    // STACK
    // =========================

    static int[] stack = new int[5];
    static int top = -1;

    // PUSH
    static void push(int value) {

        if (top == stack.length - 1) {
            System.out.println("Stack is full.");
            return;
        }

        top++;
        stack[top] = value;

        System.out.println(value + " pushed.");
    }

    // POP
    static void pop() {

        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println(stack[top] + " popped.");
        top--;
    }

    // PEEK STACK
    static void peekStack() {

        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Stack top: " + stack[top]);
    }

    // DISPLAY STACK
    static void displayStack() {

        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.print("Stack: ");

        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }

        System.out.println();
    }


    // =========================
    // QUEUE
    // =========================

    static int[] queue = new int[5];
    static int front = 0;
    static int rear = -1;

    // ENQUEUE
    static void enqueue(int value) {

        if (rear == queue.length - 1) {
            System.out.println("Queue is full.");
            return;
        }

        rear++;
        queue[rear] = value;

        System.out.println(value + " enqueued.");
    }

    // DEQUEUE
    static void dequeue() {

        if (front > rear) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println(queue[front] + " dequeued.");
        front++;
    }

    // PEEK QUEUE
    static void peekQueue() {

        if (front > rear) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("Queue front: " + queue[front]);
    }

    // DISPLAY QUEUE
    static void displayQueue() {

        if (front > rear) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue: ");

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
    }


    // =========================
    // MAIN
    // =========================

    public static void main(String[] args) {

        // STACK TEST
        System.out.println("===== STACK =====");

        push(10);
        push(20);
        push(30);

        displayStack();

        peekStack();

        pop();

        displayStack();


        System.out.println();


        // QUEUE TEST
        System.out.println("===== QUEUE =====");

        enqueue(100);
        enqueue(200);
        enqueue(300);

        displayQueue();

        peekQueue();

        dequeue();

        displayQueue();
    }
}
