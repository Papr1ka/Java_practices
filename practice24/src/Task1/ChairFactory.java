package Task1;

public class ChairFactory {
    public Chair createChair(AbstractChairFactory factory)
    {
        return factory.createChair();
    }
}
