package package_6;

public class ArrayLab
{
   
   private final static int LOW_VALUE = 1;
   private final static int HIGH_VALUE = 100;
   private final static int PRECISION = 1;
   
   public static Console_IO_Class conIO = new Console_IO_Class();

   public static void main(String[] args)
      {
         //declare variables, array capacity is a variable not a constant
        //add in variables as needed to store the return values
         int capacity = 20;
         int index;
         int min, max;
         double average;
         
         //declare array
         int[] intArray = new int[capacity];
       
         //for loop using getRandBetween method to
         //initialize array
         for( index = 0; index < intArray.length; index++ )
            {
               intArray[ index ] = getRandBetween( LOW_VALUE, HIGH_VALUE );
            }
         
     
         //call methods to return the values 
       
         min = calcMin(intArray);
         max = calcMax(intArray);
         average = calcAverage(intArray);
         
         //use Console IO Class to print min, max, average
         //use a for loop and Console IO Class to print out all
         //elements in the array
         
         conIO.printString("Min value is: ");       
         conIO.printInt(min);
         conIO.printEndline();
         
         conIO.printString("Max value is: ");       
         conIO.printInt(max);
         conIO.printEndline();
         
         conIO.printString("Average value is: ");       
         conIO.printDouble(average, PRECISION);
         conIO.printEndline();
         
         printArray(intArray);
      
      }

   public static int getRandBetween( int low, int high )
      {
         int value, range = high - low + 1;
       
         value = (int)( Math.random() * range );
       
         return low + value;
      }

   public static int calcMin(int[] inputArray) 
      {
         int index, minValue;
         
         //initialize min value
         minValue = inputArray[0];
         
         for( index = 0; index < inputArray.length; index++ )
            {
               if (inputArray[index] < minValue) 
                  {
                     minValue = inputArray[index];
                  }
            }
         
         return minValue;
      }

   public static int calcMax(int[] inputArray) 
      {
         int index, maxValue;
         
         maxValue = inputArray[0];
         
         for( index = 0; index < inputArray.length; index++ )
            {
               if (inputArray[index] > maxValue) 
                  {
                     maxValue = inputArray[index];
                  }
            }
         
         return maxValue;
      }
   
   public static double calcAverage(int[] inputArray) 
      {
         int index, sum;
         double average;
         sum = 0;
         
         for( index = 0; index < inputArray.length; index++ )
            {
               sum += inputArray[index];
            }
         
         average = sum / inputArray.length;
         
         return average;
      }
   
   public static void printArray(int[] inputArray) 
      {
         int index;
         
         for( index = 0; index < inputArray.length; index++ )
            {
               conIO.printInt(inputArray[index]);
               conIO.printString(", ");
            }
      }
   
}