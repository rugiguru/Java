import java.util.*;


public class StringSolutions {
    public static void main(String args[])
    {
          System.out.println(isUniqueChars("Guru"));
          
    }
    
    public static boolean areStringsSame(String one, String two)
    {
        return new String(one).equals(new String(two));
    }

    // check if the given string has all unique characters with 0(n) time complexity as a constraint
    public static boolean isUniqueChars(String str)
    {
        boolean[] charSet = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if(charSet[val]){
                return false;
            }
            charSet[val] = true;
        }
        return true;
    }

}
