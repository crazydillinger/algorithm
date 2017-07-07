package priv.chengkui.algorithm;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @author chengkui
 * @create 2017-07-07-13:17
 */
public class Bubble {

    public static void main(String[] args){
        int[] arr = new int[]{2,5,7,1,6};
        System.out.print(Arrays.toString(sort(arr)));
    }

    public static int[] sort(int[] arr){
        int N = arr.length;

        for(int i = 1; i < N; i++){
            for(int j = 0; j < N - i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
