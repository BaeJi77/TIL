import java.util.ArrayList;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {8, 7, 6, 5 ,4 ,3 ,2, 1, 20};
        quicksort(array, 0, array.length - 1);

        printArray(array);
    }

    public static void printArray(int[] array) {
        for(int val : array) {
            System.out.print(val + " ");
        }
            
    }

    public static void quicksort(int[] array, int left ,int right) {
        if(left < right) {
            int pivot = partition(array, left, right);
            
            // partition을 돌리고 난 이후 완벽하게 pivot은 고정이 됨
            quicksort(array, left, pivot - 1);
            quicksort(array, pivot + 1, right);
        }
    }

    public static int partition(int[] arr, int left, int right) {
        // 역순으로 되어 있을 때 최악(O(N^2))에 경우를 방지하기 위해 중간에 있는 값을 pivot으로 선택
        int mid = (left + right) / 2;
        swap(arr, left, mid);

        int pivot = arr[left];
        int i = left;
        int j = right;

        while(i < j) {
            while(pivot < arr[j]) { // pivot보다 작은 수 찾기
                j--;
            }

            while(i < j && pivot >= arr[i]) { // 피봇보다 큰 수 찾기
                i++;
            }

            swap(arr, i, j);
        }
        arr[left] = arr[i];
        arr[i] = pivot;

        

        return i;
    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
