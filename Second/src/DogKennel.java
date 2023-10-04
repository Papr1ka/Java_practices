import java.util.Arrays;

public class DogKennel {
    private Dog[] dogs;

    public void addDog(Dog[] addDogs)
    {
        if (addDogs == null)
        {
            throw new NullPointerException("add Dogs must be not null value");
        }
        int length = 0;
        if (this.dogs != null)
        {
            length = dogs.length;
        }
        Dog[] newDogs = new Dog[length + addDogs.length];
        if (this.dogs != null)
        {
            System.arraycopy(this.dogs, 0, newDogs, 0, length);
        }
        System.arraycopy(addDogs, 0, newDogs, length, addDogs.length);
        this.dogs = newDogs;
    }

    @Override
    public String toString() {
        return "DogKennel{" +
                "dogs=" + Arrays.toString(dogs) +
                '}';
    }

    public void test()
    {
        System.out.format("%-10s %-15s %10s\n", "-----", "DogKennel", "-----");

        Dog[] newDogs = {new Dog("Джек", 7), new Dog("Боб", 8), new Dog("Петрович", 10)};
        this.addDog(newDogs);
        Dog[] newDogs2 = {new Dog("Джек2", 7), new Dog("Боб2", 8), new Dog("Петрович2", 10)};
        this.addDog(newDogs2);
        System.out.println(this);

        System.out.format("%-10s %-15s %10s\n", "-----", "End DogKennel", "-----");
    }
}
