package Task1;

public class VictorianChairFactory extends AbstractChairFactory {

    @Override
    public Chair createChair() {
        return new VictorianChair(15);
    }
}
