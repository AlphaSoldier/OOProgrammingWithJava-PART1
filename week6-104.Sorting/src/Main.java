import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
sort(values);
    }
    
    public static int smallest(int[] array)
    {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if(array[i] < smallest)
                smallest = array[i];
        }
        return smallest;
    }
    
    public static int indexOfTheSmallest(int[] array)
    {
        int smallest = smallest(array);
        int index = 0;
        for (int i = 0; i < array.length; i++)
        {
            if(array[i] == smallest)
                index = i;
        }
        return index;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index)
    {
        int result = index;
        int smallest = array[index];
        for (int i = index; i < array.length; i++)
        {
            if(array[i] < smallest)
                smallest = array[i];
        }
        for (int i = 0; i < array.length; i++)
        {
            if(array[i] == smallest)
                result = i;
        }
        return result;
    }
    
    public static void swap(int[] array,int index1, int index2)
    {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array)
    {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++)
        {
            int smallestIndex = indexOfTheSmallestStartingFrom(array, i);
            if(smallestIndex != i)
                swap(array,i,smallestIndex);
            System.out.println(Arrays.toString(array));
        }
    }
}
