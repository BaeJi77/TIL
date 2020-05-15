import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 20, 5, 4, 3, 2, 1};

        mergeSort(array, 0, array.length - 1);

        for(int val : array) {
            System.out.print(val + " ");
        }
    }

    public static void mergeSort(int[] array, int left, int right) {
        if(left < right) {
            int mid = (left + right) / 2;

            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            merge(array, left, mid, mid + 1, right);
        }
    }

    public static void merge(int[] array, int left, int leftEnd, int right, int rightEnd) {
        int[] newArray = Arrays.copyOf(array, array.length);
        int i = left;

        while(left <= leftEnd && right <= rightEnd) {
            if(newArray[left] < newArray[right]) {
                array[i] = newArray[left];
                left++;
            } else {
                array[i] = newArray[right];
                right++;
            }
            i++;
        }

        while(left <= leftEnd) 
            array[i++] = newArray[left++];

        while(right <= rightEnd) 
            array[i++] = newArray[right++];
    }
}