public class Box<T, V, K>
{
    private T type;
    private V value;
    private K key;
    public Box(T type, V value, K key)
    {
        this.type = type;
        this.value = value;
        this.key = key;
    }

    public T getType() {
        return type;
    }

    public V getValue() {
        return value;
    }

    public K getKey() {
        return key;
    }

    void printClasses()
    {
        System.out.println(this.type.getClass().getName());
        System.out.println(this.value.getClass().getName());
        System.out.println(this.key.getClass().getName());
    }
}
