import java.util.Arrays;

public class LearnJava {
    static int[] sort = new int[] { 12, 4, 54, 57, 87, 39, 41, 8, 3, 14, 11, 36, 24, 31, 32 };
    public static void main(String[] args) {
        int[] sort2 = sort;
        int[] sort3 = sort;
        Arrays.sort(sort);
        System.out.println("arrays");
//        for (int i = 0; i < sort.length; i++) {
//            System.out.println(sort[i]);
//        }
        for (int i : sort) {
            System.out.print(i+" ");
        }
//        冒泡排序
        sort2=bubbleSort(sort2);
        System.out.println("\n"+"冒泡排序");
        for (int i : sort2) {
            System.out.print(i+" ");
        }
//        快速排序
        sort3=QuickSort(sort3,3,5);
        System.out.println("\n"+"快速排序");
        for (int i : sort3) {
            System.out.print(i+" ");
        }

    }

    /**
     * 冒泡排序
     **/
    public static int[] bubbleSort(int[] array) {
        if (array.length == 0)
            return array;
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length - 1 - i; j++)
                if (array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
        return array;
    }
    /**
     * 快速排序方法
     */
    public static int[] QuickSort(int[] array, int start, int end) {
        if (array.length < 1 || start < 0 || end >= array.length || start > end) return null;
        int smallIndex = partition(array, start, end);
        if (smallIndex > start)
            QuickSort(array, start, smallIndex - 1);
        if (smallIndex < end)
            QuickSort(array, smallIndex + 1, end);
        return array;
    }
    /**
     * 快速排序算法——partition
     */
    public static int partition(int[] array, int start, int end) {
        int pivot = (int) (start + Math.random() * (end - start + 1));
        int smallIndex = start - 1;
        swap(array, pivot, end);
        for (int i = start; i <= end; i++)
            if (array[i] <= array[end]) {
                smallIndex++;
                if (i > smallIndex)
                    swap(array, i, smallIndex);
            }
        return smallIndex;
    }

    /**
     * 交换数组内两个元素
     */
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

//    public static void bubble() {
//        for
//
//
//    }
}
