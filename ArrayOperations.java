import java.util.*;
class ArrayOperations
{
      public static void main(String args[])
      {
            makeIntArray();
      }

      // construct an array of integers  from user inputs 
      public static void makeIntArray() {
            Scanner obj = new Scanner (System.in);
            List<Integer> intArray = new ArrayList<Integer>();
            System.out.println ("Enter numbers to add add to the array. Enter any string to end list.");
            while (obj.hasNext())
            {
                  if (obj. hasNextInt())
                  {
                    intArray.add(obj.nextInt());
                  }
                  else
                  {
                        break;
                  }
            }
            System.out.println ("The numbers array " + intArray);
            obj.close();
      }
}