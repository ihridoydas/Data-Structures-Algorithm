public class quickSort {
    private static void QuickSort(int[] arr, int left, int right) {

        int index = partition(arr, left, right);

        if (left < index - 1)
            QuickSort(arr, left, index - 1);
        if (index + 1 < right)
            QuickSort(arr, index + 1, right);

    }

    private static int partition(int[] arr, int left, int right) {

        int pivot = arr[(left + right) / 2];
        while (left <= right) {

            while (arr[left] < pivot)
                left++;
            while (arr[right] > pivot)
                right--;

            if (left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
        return left;

    }

    public static void main(String[] args) {
        int[] array = new int[] { 10, 9, 8, 3, 34, 32, 5, 67, 45 };

        QuickSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length - 1; i++) {

            System.out.print(array[i] + "  ");
        }

    }
}
