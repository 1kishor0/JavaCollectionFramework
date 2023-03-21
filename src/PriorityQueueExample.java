import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        //Comparator.reverseOrder() give the priority in reverse
        pq.offer(10);
        pq.offer(20);
        pq.offer(30);
        pq.offer(3);
        pq.offer(56);
        //minimum element will be the top in priority queue
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());

    }
}
