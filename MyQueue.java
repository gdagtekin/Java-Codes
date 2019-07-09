package algorithms;

/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2016
 */
public class MyQueue {

    private int head;
    private int end;
    private int maxSize;
    private int dataSize;
    private int[] Queue;

    public MyQueue(int size) {
        maxSize = size;
        head = 0;
        end = -1;
        dataSize = 0;
        Queue = new int[maxSize];
    }

    public boolean isFull() {
        return dataSize == maxSize;
    }

    public boolean isEmpty() {
        return dataSize == 0;
    }

    public void add(int s) {
        if (isFull()) {
            System.out.println("Queue full");
        } else {
            end = (end + 1) % maxSize;
            Queue[end] = s;
            dataSize++;
        }
    }

    public int pop() {
        int temp = 0;
        if (isEmpty()) {
            System.out.println("kuyruk boş");
        } else {
            temp = Queue[head];
            head = (head + 1) % maxSize;
            dataSize--;
        }
        return temp;
    }

    public int peekFront() {
        return Queue[head];
    }

    public int size() {
        return dataSize;
    }
    
    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue(5);
        for (int i = 0; i < 6; i++) {
            myQueue.add(i);
        }

        myQueue.pop();
        System.out.println("Data pop");
        System.out.println("Peek: " + myQueue.peekFront());
        myQueue.add(5);
        System.out.println("Data added");
    }
}
