import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQue {
    public static void main(String[] args) {

        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

                queue.offer(3.0);
                queue.offer(2.5);
                queue.offer(4.0);
                queue.offer(1.5);
                queue.offer(2.0);

                while(!queue.isEmpty()){
                    System.out.println(queue.poll());
                }
    }
}

class PriorityQue2 {
    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer("A");
        queue.offer("F");
        queue.offer("D");
        queue.offer("C");
        queue.offer("B");

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}