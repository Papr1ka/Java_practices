public class Exception6 {
    public void printMessage(String key) {
        String message = null;
        try
        {
            message = getDetails(key);
        }
        catch (NullPointerException e)
        {
            message = "data for null";
        }
        finally {
            System.out.println(message);
        }
    }

    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }
}