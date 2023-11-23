package Task2;

public interface Queue<E> {
    public void enqueue(E elem);
    public E element();
    public E dequeue();
    public int size();
    public boolean isEmpty();
    public void clear();
}
