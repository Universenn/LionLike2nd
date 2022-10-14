package lionlike.java10m.practice.day1014.insertionsort;

import java.util.Arrays;

public class InsertionSort1 {
    public int[] Sort1(int[] arr, int j){
        // i = 1 arr[1] vs arr[0]

        // i = 2 arr[2] vs arr[1]
        // i = 1 arr[1] vs arr[0]

        int i = j;
        int temp;
        if (arr[i] < arr[i-1]) { //arr[1] < arr[0]
            temp = arr[i-1]; // 0 <-5
            arr[i-1] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr1 = {8,5,6,2,4};
        InsertionSort1 is = new InsertionSort1();

        // 1번째 index
        int[] result1 = is.Sort1(arr1,1);
        System.out.println(Arrays.toString(result1));

        // 2번째 index
        int[] arr2 = {5,8,6,2,4};
        int[] result2 = is.Sort1(arr2,2);

    }
}
