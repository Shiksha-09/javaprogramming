import java.util.PriorityQueue;

public class Heap {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(1);
        pq.add(25);

        System.out.println("Min Heap");

        while (!pq.isEmpty()) {
            System.out.print(" -----> " + pq.poll());
        }

        System.out.println();
    }
}