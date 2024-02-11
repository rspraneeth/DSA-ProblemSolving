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
        rear++;
//        rear = rear%arr.length;
        arr[rear]=data;
        size++;
        System.out.println("Front:"+front+", Rear:"+rear);
    }

    public int deque(){
        int data = arr[front];
        front++;
        System.out.println("Front:"+front+", Rear:"+rear);
        return data;
    }

    public void printQueue() {
        int i = front;
        while (i%arr.length!=rear){
            System.out.print(arr[i%arr.length]+" ");
            i++;
        }

        System.out.println(arr[i%arr.length]);
        System.out.println("Front:"+front+", Rear:"+rear);
    }

    public void show(){
        for (int i=front; i < size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

public class QueueImpl{
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(3);
        queue.enqueue(6);
        queue.enqueue(8);
        queue.printQueue();
        queue.deque();
        queue.printQueue();
        queue.enqueue(10);
        queue.printQueue();
        queue.enqueue(14);
        queue.printQueue();
        queue.enqueue(17);
        queue.printQueue();
//        queue.enqueue(19);
//        queue.printQueue();

    }
}
