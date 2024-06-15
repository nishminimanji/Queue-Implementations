package kk;
import java.util.ArrayDeque;
import java.util.Queue;

public class QueueUsingArrayDequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Queue<Integer> queue = new ArrayDeque<>();
		
		// Adding elements to the queue
        queue.offer(15);
        queue.offer(22);
        queue.offer(30);

        // Removing and printing elements from the queue
        System.out.println(queue.poll());
        
        //Returns the Top Value 
        System.out.println(queue.peek());
        
        
         while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

	}
}
