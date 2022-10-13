package lionlike.java10m.practice.day1013.bubblesort;

import java.util.Arrays;

public class SelectionSort01 {
    public int[] selectionsort(int[] arr){
        int tem = arr[0];
        for (int i = 1; i <arr.length; i++){
            if (tem>arr[i]){
                tem = arr[i];
                arr[i] = arr[0];
                arr[0] = tem;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 3, 9, 28, 11};

        SelectionSort01 bubbleSort01 = new SelectionSort01();
        arr =bubbleSort01.selectionsort(arr);
        System.out.println(Arrays.toString(arr));


    }
}
