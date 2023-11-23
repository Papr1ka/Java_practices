package Task1;

public class ArrayQueueADT<E> {
    private final Object[] items;
    private final int size;
    private int front, rear;

    ArrayQueueADT()
    {
        this.front = -1;
        this.rear = -1;
        this.size = 5;
        this.items = new Object[this.size];
    }

    ArrayQueueADT(int size)
    {
        if (size <= 0)
        {
            throw new IllegalArgumentException("size mush be gt than 0");
        }
        this.front = -1;
        this.rear = -1;
        this.size = size;
        this.items = new Object[this.size];
    }

    public boolean isFull()
    {
        return front == 0 && rear == this.size - 1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public int size()
    {
        return this.rear == -1 ? 0 : this.rear + 1;
    }

    public void enQueue(E element)
    {
        if (isFull())
        {
            throw new ArrayIndexOutOfBoundsException("queue is full");
        }
        else
        {
            if (front == -1)
            {
                front = 0;
            }
            rear++;
            items[rear] = element;
        }
    }

    public E element()
    {
        E element;
        if (isEmpty())
        {
            System.out.println("Queue is empty");
            throw new ArrayIndexOutOfBoundsException("delete from empty queue");
        }
        else
        {
            element = (E) items[front];
            return (element);
        }
    }

    public E deQueue()
    {
        E element;
        if (isEmpty())
        {
            System.out.println("Queue is empty");
            throw new ArrayIndexOutOfBoundsException("delete from empty queue");
        }
        else
        {
            element = (E) items[front];
            if (front >= rear)
            {
                front = -1;
                rear = -1;
            }
            else
            {
                front++;
            }
            return (element);
        }
    }

    public void display()
    {
        int i;
        if (isEmpty())
        {
            System.out.println("Empty Queue");
        }
        else
        {
            System.out.println("\nFront index-> " + front);
            System.out.println("Items -> ");
            for (i = front; i <= rear; i++)
                System.out.print(items[i] + " ");
            System.out.println("\nRear index-> " + rear);
        }
    }

    public void clear()
    {
        int i;
        if (!isEmpty())
        {
            this.front = -1;
            this.rear = -1;
        }
    }

    public static void main(String[] args) {
        ArrayQueueADT<String> q = new ArrayQueueADT<String>();
        for (int i = 1; i < 6; i++)
        {
            q.enQueue(String.valueOf(i) + String.valueOf(i));
        }
        q.display();
        q.deQueue();
        q.display();
    }
}
