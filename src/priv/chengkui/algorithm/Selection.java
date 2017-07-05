package priv.chengkui.algorithm;

import java.util.Arrays;

/**
 * 选择排序
 *
 * @author chengkui
 * @create 2017-07-05-22:23
 */
public class Selection {

    public static void main(String[] args){
        int[] arr = new int[]{2,5,7,1,6};
        System.out.print(Arrays.toString(sort(arr)));
    }

    private static int[] sort(int[] arr) {
        int N = arr.length;
        for(int i = 1; i < N; i++){
            int minIndex = i - 1;//最小元素下标
            for(int j = i ; j < N; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            if(minIndex != (i -1)){
                int temp = arr[minIndex];
                arr[minIndex] = arr[i - 1];
                arr[i - 1] = temp;
            }
        }
        return arr;
    }
}
