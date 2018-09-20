package Kyle;

public class CTamLib {
    public static boolean isPalindrome(String str)
    {
        String temp = "";
        int x = 1;
        int y = 0;
        while (temp.length()<str.length())
        {
            temp = temp + str.substring(str.length()-x,str.length()-y);
            x++;
            y++;
        }
        if (temp.equals(str))
            return true;
        else
            return false;
    }

    public static String dateStr(String str)
    {
        String month = str.substring(0,2);
        String date = str.substring(3,5);
        String year = str.substring(6,10);
        return (date + "-" + month + "-" + year);
    }

    public static String cutOut(String a,String b)
    {
        for (int x = 0; x < a.length()-2; x++)
        {
            int y = x + b.length();
            if (a.substring(x,y).equals(b))
            {
                if (x == 0)
                    return (a.substring(y));
                else
                    return (a.substring(0,x) + a.substring(y));
            }
        }
        return (a);
    }

    public static boolean isFibonnaci(int x)
    {
        int y = 0;
        int z = 0;
        int total = 1;
        if (x == total)
            return true;
        while (x > total)
        {
            y = z;
            z = total;
            total = y + z;
            if (x == total)
                return true;
        }
            return false;
    }

    public static int sumUpTo(int x)
    {
        int y = 0;
        int total = 0;
        while (y <= x)
        {
            total = total + y;
            y++;
        }
        return total;
    }

}
