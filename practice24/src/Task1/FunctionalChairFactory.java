package Task1;

public class FunctionalChairFactory extends AbstractChairFactory {

    @Override
    public Chair createChair() {
        return new FunctionalChair();
    }
}
