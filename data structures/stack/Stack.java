
public class Stack {
    private int[] elements;
    private int top;
    private int max;

    Stack(int size) {
        elements = new int[size];
        top = -1;
        max = size;

    }

    public void push(int element) {
        if (!isFull()) {
            top++;
            elements[top] = element;

        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("listeniz bostur ");
        } else {

            System.out.print(elements[top] + " | ");
            top--;
        }
        // return elements[top];

    }

    public int peek() {
        return elements[top];
    }

    public boolean isEmpty() {
        if (top == -1)
            return true;
        else
            return false;
    }

    public boolean isFull() {
        if (top == (max - 1))
            return true;
        else
            return false;
    }

    public int size() {
        return top;
    }

    public void List() {
        if (top == -1) {
            System.out.println("listeniz Bos  yazdiracagim bir sey yoktur yani ");
        }
        for (int i = (top); i >= 0; i--) {
            if (elements[i] != 0)
                System.out.print(elements[i] + " ");

        }
    }

}