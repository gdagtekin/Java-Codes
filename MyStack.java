package algorithms;

/**
 *
 * @author Gökhan DAĞTEKİN 
 * 
 * 2016
 */
public class MyStack {

    int max;
    int StackArray[];
    int top;

    public MyStack(int s) {
        max = s;
        StackArray = new int[max];
        top = -1;
    }

    public void push(int veri) {
        if (isFull()) {
            System.out.println("Stack full");
        } else {
            top++;
            StackArray[top] = veri;
        }
    }

    public int pop() {
        int temp;
        if (isEmpty()) {
            System.out.println("Stack empty");
            return -1;
        } else {
            temp = StackArray[top];
            top--;
            return temp;
        }
    }

    public int size() {
        return top + 1;
    }

    public int peek() {
        if (!isEmpty()) {
            return StackArray[top];
        }
        return -1;
    }

    public boolean isFull() {
        return top == max - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        MyStack s = new MyStack(2);
        System.out.println("Stack created. Max size: " + s.max);
        s.push(5);
        System.out.println("Data pushed");
        System.out.println("Stack size: " + s.size());
        s.push(7);
        System.out.println("Data pushed");
        System.out.println("Stack size: " + s.size());
        System.out.println("Data peek: " + s.peek());
        System.out.println("Data peek: " + s.peek());
        System.out.println("Data pushed");
        s.push(9);
        s.pop();
        System.out.println("Data pop");
        System.out.println("Stack size: " + s.size());
        System.out.println("Data peek: " + s.peek());
        s.pop();
        System.out.println("Data pop");
        System.out.println("Stack size: " + s.size());
        s.pop();
        System.out.println("Data pop");
        System.out.println("Data peek: " + s.peek());
    }
}
