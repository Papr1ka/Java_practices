package Task1;

public class ArrayQueue<E> {
//    Инвариант: количество элементов всегда больше 0
//    Реализует FIFO
//    Достать из пустой очереди нельзя
//    Положить в полную очередь нельзя

    private final Object[] items;
    private final int size;
    private int front, rear;

    ArrayQueue()
    {
        //Предусловие: нет
        //Постусловие: Будет создана пустая очередь из 5 элементов
        this.front = -1;
        this.rear = -1;
        this.size = 5;
        this.items = new Object[this.size];
    }

    ArrayQueue(int size)
    {
        //Предусловие: size - размер очереди, size > 0
        //Посусловие: Будет создана пустая очередь из size элементов
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

    public boolean isEmpty()
    {
        //Предусловие: нет
        //Постусловие: true, если очередь пуста, иначе false
        return front == -1;
    }

    public int size()
    {
        //Предусловие: нет
        //Постусловие: количество занятых ячеек в очереди
        return this.rear == -1 ? 0 : this.rear + 1;
    }

    public void enQueue(E element)
    {
        //Предусловие: element - новый элемент, очередь не полная
        //Постусловие: element будет добавлен в конец очереди
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
        //Предусловие: очередь не пуста
        //Постусловие: первый элемент в очереди
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
        //Предусловие: Очередь не пуста
        //Постусловие: Возвращает и удаляет первый элемент в очереди
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
        //Предусловие: нет
        //Постусловие: Очередь будет очищена
        this.front = -1;
        this.rear = -1;
    }

    public static void main(String[] args) {
        ArrayQueue<String> q = new ArrayQueue<String>();
        for (int i = 1; i < 6; i++)
        {
            q.enQueue(String.valueOf(i) + String.valueOf(i));
        }
        System.out.println(q.size());
        q.display();
        q.deQueue();
        q.display();
        q.clear();
        System.out.println(q.size());
        q.display();
    }
}
