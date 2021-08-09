
public class quickSort_dec
{
   public static void quickSort(Integer[] array, int lowest, int highest) 
       {
         if (array == null || array.length == 0){
             return;
         }
         if (lowest >= highest){
             return;
         }
  
         int middle = lowest + (highest - lowest) / 2;
         int pivot = array[middle];
 
         int i = lowest, j = highest;
         while (i <= j)
         {
             while (array[i] > pivot) 
             {
                 i++;
             }
             while (array[j] < pivot) 
             {
                 j--;
             }
             if (i <= j) 
             {
                 swap (array, i, j);
                 i++;
                 j--;
             }
         }
    
         if (lowest < j)
         {
             quickSort(array, lowest, j);
         }
         if (highest > i)
         {
             quickSort(array, i, highest);
         }
     }
      
     public static void swap (Integer array[], int x, int y)
     {
         int swapArray = array[x];
         array[x] = array[y];
         array[y] = swapArray;
     }
     
     public static void main(String[] args) 
     {
         Integer[] testArray = new Integer[] { 5,24,2,45,5,20,99,56,5,101,2,53,12,20};
         quickSort( testArray, 0, testArray.length - 1 );
        for(int i=0;i<testArray.length;i++){
            System.out.print(testArray[i] + "  ");
        }
     }
 }
