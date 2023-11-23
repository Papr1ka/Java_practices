package Task2;

public class LinkedQueue<E> implements Queue {
    private QueueElem<E> head;
    private QueueElem<E> tail;
    private int size;
    public LinkedQueue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public void enqueue(Object elem) {
        QueueElem<E> newElem = new QueueElem<E>(elem);
        if (this.head == null)
        {
            this.head = newElem;
            this.tail = newElem;
        }
        else
        {
            this.tail.setNext(newElem);
            this.tail = this.tail.getNext();
        }
        this.size++;
    }

    @Override
    public Object element() {
        if (this.head == null)
        {
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        return this.head.getValue();
    }

    @Override
    public Object dequeue() {
        if (this.head == null)
        {
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        QueueElem<E> elem = this.head;
        this.head = this.head.getNext();
        this.size--;
        return elem.getValue();
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public void clear() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
}
