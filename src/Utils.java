import java.util.List;

public class Utils {
    static boolean isInt(String s)
    {
        try
        { int i = Integer.parseInt(s); return true; }

        catch(NumberFormatException er)
        { return false; }
    }

    public static String[] getSplited(String toSplit) {
        return toSplit.split("\\.");
    }
}
