public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};
        insertionSort(array);

        for(int val : array) {
            System.out.println(val);
        }
    }

    public static void insertionSort(int[] array) {
        for(int i = 0 ; i < array.length ; ++i) {
            int j = i;
            while(j != 0) {
                if(array[j - 1] < array[j])
                    break;

                swap(array, j - 1, j);
                j--;
            }
        }
    }

    public static void swap(int[] array , int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}