package priv.chengkui.algorithm;

import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] arr = new int[]{5,8,2,9,0,3};
        System.out.print(Arrays.toString(insertSort(arr)));
    }

    public static int[] insertSort(int[] arr){
        for(int i = 1; i < arr.length;i++){
            int temp = arr[i];
            for(int j = i; j > 0 && arr[j - 1] > arr[j];j--){
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
        return arr;
    }
}
