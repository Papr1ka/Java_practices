package Task2;

public class Task2 {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedQueue<Integer>();
        queue.enqueue(3);
        queue.enqueue(6);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);
        System.out.println(queue.size());
        System.out.println(queue.dequeue());
        System.out.println(queue.element());
        System.out.println(queue.isEmpty());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.clear();
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
    }
}
