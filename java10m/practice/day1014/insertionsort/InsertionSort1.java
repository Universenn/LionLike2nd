package lionlike.java10m.practice.day1014.insertionsort;

import java.util.Arrays;

public class InsertionSort1 {
    public int[] Sort1(int[] arr){
        for (int i = 1; i< arr.length; i++) {
            for (int j = i; j>0; j--) {
                if (arr[j] < arr[j-1]) { //arr[1] < arr[0]
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] num = {7,3,2,8,9,4,6,1,5};
        InsertionSort1 is = new InsertionSort1();

        // 1번째 index
        int[] result1 = is.Sort1(num);
        System.out.println(Arrays.toString(result1));

        // 2번째 index
        int[] arr2 = {5,8,6,2,4};
        int[] result2 = is.Sort1(arr2);

    }
}
