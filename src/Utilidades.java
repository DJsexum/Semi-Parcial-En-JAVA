public class Utilidades
{
    public static boolean verificarEntero(String input)
    {
        try
        {
            Integer.parseInt(input);
            return true;
        }
            catch (NumberFormatException e)
            {
                return false;
            }
    }

    public static boolean verificarDouble(String input)
    {
        try
        {
            Double.parseDouble(input);
            return true;
        }
            catch (NumberFormatException e)
            {
            return false;
            }
    }
}