package Studio;

public class Atelier {
    public void dressMan(Clothes[] clothes)
    {
        System.out.println("Мужская одежда:");
        for (Clothes cl: clothes)
        {
            if (MenClothing.class.isAssignableFrom(cl.getClass()))
            {
                System.out.println(cl);
            }
        }
    }

    public void dressWomen(Clothes[] clothes)
    {
        System.out.println("Женская одежда:");
        for (Clothes cl: clothes)
        {
            if (WomanClothing.class.isAssignableFrom(cl.getClass()))
            {
                System.out.println(cl);
            }
        }
    }
}
