import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {
    public static void main(String[] args) {
        Queue <Integer>  queue= new LinkedList<>();
      //add can be use but offer function is best for use
        queue.offer(12);
        queue.offer(24);
        queue.offer(54);
        queue.offer(76);

        System.out.println(queue);
//remove and return remove() function can do the same but poll() is the best
        System.out.println(queue.poll());
        System.out.println(queue);
        //next which element is the next , we can use element but best is peek
        System.out.println(queue.peek());
    }

}
