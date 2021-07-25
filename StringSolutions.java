import java.util.*;


public class StringSolutions {
    public static void main(String args[])
    {
          System.out.println(areStringsSame("Guru", "Guru"));
          
    }
    
    public static boolean areStringsSame(String one, String two)
    {
        return new String(one).equals(new String(two));
    }

}
