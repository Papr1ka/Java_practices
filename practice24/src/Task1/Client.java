package Task1;

public class Client {
    public Chair chair;

    public void sit()
    {
        System.out.println("Клиент сел на " + this.chair.getClass().getName() + " стул");
        if (this.chair instanceof MagicChair)
        {
            ((MagicChair) this.chair).doMagic();
        }
        else if (this.chair instanceof VictorianChair)
        {
            System.out.println("Возраст " + ((VictorianChair) this.chair).getAge());
        }
        else
        {
            System.out.println("Стул считает, что 2 + 2 = " + ((FunctionalChair) this.chair).sum(2, 2));
        }
    }

    public void setChair(Chair chair)
    {
        this.chair = chair;
    }
}
