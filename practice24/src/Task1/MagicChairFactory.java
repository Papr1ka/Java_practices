package Task1;

public class MagicChairFactory extends AbstractChairFactory{
    @Override
    public Chair createChair() {
        return new MagicChair();
    }
}
