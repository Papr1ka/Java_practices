public class Exception5
{
    public void exceptionDemo(String key)
    {
        try
        {
            if (key == null)
            {
                throw new NullPointerException("null key");
            }
            else
            {
                System.out.println(key);
            }
        }
        catch (NullPointerException e)
        {
            System.out.println("null key");
        }
    }
}
