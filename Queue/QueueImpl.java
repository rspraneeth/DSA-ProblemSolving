package Queue;

class Queue {
    //fifo
    int[] arr = new int[5];
    private int front, rear, size=0;
    public Queue(){
        front=0;
        rear=-1;
    }

    public void enqueue(int data){
        if (!isFull()){
//            rear++;
            rear = (rear+1)%arr.length;
            arr[rear]=data;
            size++;
            System.out.println("Front:"+front+", Rear:"+rear);
        }else {
            System.out.println("Queue full");
        }

    }

    public int deque(){
        if (isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        int data = arr[front];
//        front++;
        front = (front+1)%arr.length;
        size--;
        System.out.println("Front:"+front+", Rear:"+rear);
        return data;
    }

//    public void printQueue() {
//        int i = front;
//        while (i%arr.length!=rear){
//            System.out.print(arr[i%arr.length]+" ");
//            i++;
//        }
//
//        System.out.println(arr[i%arr.length]);
//        System.out.println("Front:"+front+", Rear:"+rear);
//    }

    public void show(){
//        for (int i=front; i < size;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();

        int i = front;
        while (i%arr.length!=rear){
            System.out.print(arr[i%arr.length]+" ");
            i++;
        }

        System.out.println(arr[i%arr.length]);
//        System.out.println("Front:"+front+", Rear:"+rear);
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean isFull(){
        return size==arr.length;
    }
}

public class QueueImpl{
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(3);
        queue.enqueue(6);
        queue.enqueue(8);
        queue.show();
        System.out.println(queue.deque());
        queue.show();
        queue.enqueue(10);
        queue.show();
        queue.enqueue(14);
        queue.show();
        queue.enqueue(17);
        queue.show();
        System.out.println(queue.deque());
        queue.show();
        queue.enqueue(19);
        queue.show();
        queue.enqueue(22);
        System.out.println(queue.deque());
        System.out.println(queue.deque());
        queue.show();
        queue.enqueue(25);
        queue.enqueue(28);
        queue.show();
    }
}
