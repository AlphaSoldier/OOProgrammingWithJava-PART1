
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        // write code here
        int j = 0;
        for (int i = 0; i < array.length; i++)
        {
            j = array[i];
            for (int k = 0; k < j; k++)
            {
                System.out.print('*');
            }
            System.out.println("");
            j = 0;
        }
    }
}
