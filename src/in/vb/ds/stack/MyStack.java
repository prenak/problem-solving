package in.vb.ds.stack;

public class MyStack {

    int top = -1;
    int[] stack = null;

    public MyStack(int size){
        this.stack = new int[size];
    }

    public void push(int data){
        stack[++top] = data;
    }

    public int pop() {
        return (top == -1) ? -1 : stack[top--];
    }

    public int peek() {
        return (top == -1) ? -1 : stack[top];
    }
}
