package Stack;

class Stack {
    private int[] arr = new int[5];
    int top;
    int size;

    public Stack(){
        size = arr.length;
        top = -1;
    }
    public void push(int data){

        if (top < size-1){
            arr[++top] = data;
        }
        else {
            System.out.println("Stack overflow");
        }
    }

    public void printStack(){
        for (int i: arr) System.out.print(i+" ");
    }

    public void pop() {
        int el = arr[top];
        arr[top--] = 0;
    }

    public int peep() {
        return arr[top];
    }
}

public class StackImpl{
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(6);
        stack.push(8);
        stack.push(12);
        stack.push(15);

        stack.push(19);
        stack.pop();
        stack.printStack();
        System.out.println(stack.peep());
    }
}
