import java.util.Arrays;

public class Shop {
    private Computer[] computers;

    public void addComputer(Computer comp)
    {
        int length = 0;
        if (this.computers != null)
        {
            length = this.computers.length;
        }
        Computer[] newComputers = new Computer[length + 1];
        for (int i = 0; i < length; i++)
        {
            newComputers[i] = this.computers[i];
        }
        newComputers[length] = comp;
        this.computers = newComputers;
    }

    public Computer getComputer(int index)
    {
        return this.computers[index];
    }

    public void removeComputer(int index)
    {
        int newLength = this.computers.length - 1;
        Computer[] newComputers = new Computer[newLength];
        int ind = 0;
        for (int i = 0; i < newLength; i++)
        {
            if (i == index)
            {
                continue;
            }
            newComputers[ind] = this.computers[i];
            ind++;
        }
        this.computers = newComputers;
    }

    public int getComputerIndex(String name)
    {
        for (int i = 0; i < this.computers.length; i++)
        {
            if (this.computers[i].getName().equals(name))
            {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "computers=" + Arrays.toString(computers) +
                '}';
    }
}
