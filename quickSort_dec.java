
public class quickSort_dec {
    public static void quickSort(int array[], int left, int right) {

        if (array == null || array.length == 0) {
            return;
        }
        if (left >= right) {
            return;
        }

        // start partitiion

        // if are want ascending order

        // while (array[i] < pivot)
        //     i++;
        // while (array[j] > pivot)
        //     j--;

        int pivot = array[left];

        int i = left, j = right;
        while (i <= j) {
            while (array[i] > pivot)
                i++;
            while (array[j] < pivot)
                j--;

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // end of partition

        // start of quick sort

        if (left < j) {
            quickSort(array, left, j);
        }
        if (right > i) {
            quickSort(array, i, right);
        }
        // end of quick sort
    }

    // Main Mothod

    public static void main(String[] args) {
        int[] array = { 5, 24, 2, 45, 5, 20, 99, 56, 5, 101, 2, 53, 12, 20 };
        quickSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}
