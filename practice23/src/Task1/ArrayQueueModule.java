package Task1;

public class ArrayQueueModule {
    private int[] items;
    private int size;
    private int front, rear;

    ArrayQueueModule()
    {
        this.front = -1;
        this.rear = -1;
        this.size = 5;
        this.items = new int[this.size];
    }

    ArrayQueueModule(int size)
    {
        if (size <= 0)
        {
            throw new IllegalArgumentException("size mush be gt than 0");
        }
        this.front = -1;
        this.rear = -1;
        this.size = size;
        this.items = new int[this.size];
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

    public void enqueue(int element)
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

    public int element()
    {
        int element;
        if (isEmpty())
        {
            System.out.println("Queue is empty");
            throw new ArrayIndexOutOfBoundsException("delete from empty queue");
        }
        else
        {
            element = items[front];
            return (element);
        }
    }

    public int dequeue()
    {
        int element;
        if (isEmpty())
        {
            System.out.println("Queue is empty");
            throw new ArrayIndexOutOfBoundsException("delete from empty queue");
        }
        else
        {
            element = items[front];
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
        ArrayQueueModule q = new ArrayQueueModule();
        for (int i = 1; i < 6; i++)
        {
            q.enqueue(i);
        }
        System.out.println(q.size());
        q.display();
        q.dequeue();
        q.display();
    }
}
