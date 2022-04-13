import java.util.LinkedList;
import java.util.Queue;

public class Queuee {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>();
        queue.offer("Karren");
        queue.offer("BMW");
        queue.offer("Audi");

        System.out.println(queue);

    }
}
