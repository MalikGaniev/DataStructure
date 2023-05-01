import java.util.Stack;

public class ReverseFirstKElementsQueueProblem {
    public static void main(String[] args) {
       MyQueue<Integer> queue=new MyQueue<>();
        for (int i = 1; i < 6; i++) {
            queue.enqueue(i);
        }
        System.out.println("Queue before reverse first K elements");
        queue.printQueue();
        System.out.println();
        System.out.println("Queue before reverse first K elements");
        reverseFirstK(queue,4).printQueue();
    }
    static MyQueue<Integer> reverseFirstK(MyQueue<Integer> queue, int k){
        //create a stack
     Stack<Integer> stack=new Stack<>();
        // push first K elements into stack
    for (int i=0; i<k ;i++){
        stack.push(queue.dequeue());
    }
        // enqueue elements back into the queue
      while (!stack.isEmpty()){
          queue.enqueue(stack.pop());
      }
        // dequeue and enqueue size of queue -k times
        for (int i = 0;i<queue.size-k;i++){
            queue.enqueue(queue.dequeue());
        }
     return queue;
    }
}
