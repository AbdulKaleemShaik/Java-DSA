public class Stack {
    int[] arr;

    private static final int SIZE = 10;
    private static int top = -1;

    Stack(int s) {
        arr = new int[s];
    }

    Stack() {
        this(SIZE);
    }

    public void push(int item) {
        if (isfull()) {
            System.out.println("Stack is full");
        }
        arr[++top] = item;

    }

    public void pop() {
        if (isempty()) {
            System.out.println("Stack is empty");
        }
        System.out.println(arr[top--]);
    

    }

    private boolean isempty() {
        if (top == 0) {
            return true;
        }
        return false;
    }

    private boolean isfull() {
        if (top == arr.length - 1) {
            return true;
        }
        return false;
    }

    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + "  ");

        }
    }

    public static void main(String[] args) {
        Stack sr = new Stack();
        sr.push(23);
        sr.push(45);
        sr.push(55);
        sr.push(456);
        sr.push(5);
        sr.display();
        sr.pop();
        sr.display();
    }
}
