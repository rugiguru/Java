import java.util.*;
class ArrayOperations
{
      public static void main(String args[])
      {
            int[] myArray = {25,23,26,47};
            reverseArray(myArray);
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

      // Method 1 for copying one array to another array
      public static void duplicateArray(int[] inputArray){

            int[] arrayCopy = new int[inputArray.length];

            for (int i = 0; i < inputArray.length; i++) {
                  arrayCopy[i] = inputArray[i];
            }
            
            System.out.println(Arrays.toString(arrayCopy));  
            
      }

      // reverse an array 
      public static void reverseArray(int[] array){

            int[] reversedArray = new int[array.length];
            int j = array.length;
            for (int i = 0; i < array.length; i++) {
                  reversedArray[j-1] = array[i];
                  j = j-1;
            }

            System.out.println(Arrays.toString(reversedArray));  

      }

      
}