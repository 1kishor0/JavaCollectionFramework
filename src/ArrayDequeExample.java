import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq=new ArrayDeque<>();
        //Double sided
        adq.offer(23);
        adq.offer(34);
        adq.offer(56);
        adq.offerFirst(1);
        adq.offerLast(100);
        adq.offer(56);
        System.out.println(adq);
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());
        adq.pollFirst();
        System.out.println(adq);
        adq.pollLast();
        System.out.println(adq);


    }
}

