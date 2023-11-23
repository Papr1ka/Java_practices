package Task2;

public class QueueElem<E> {
    private Object value;
    private QueueElem<E> next;

    public QueueElem(Object value) {
        this.value = value;
        this.next = null;
    }

    public E getValue() {
        return (E) value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public QueueElem<E> getNext() {
        return next;
    }

    public void setNext(QueueElem<E> next) {
        this.next = next;
    }
}
