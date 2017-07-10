package priv.chengkui.algorithm;

import java.util.Arrays;

/**
 * 希尔排序(缩小增量排序)
 *
 * @author chengkui
 * @create 2017-07-09-10:41
 */
public class Shell {

    public static void main(String[] args){
        int[] arr = new int[]{2,5,7,1,6,3};
        System.out.print(Arrays.toString(sort(arr)));
    }

    public static int[] sort(int[] arr){
        int i,j,grap;
        int N = arr.length;
        for(grap = N / 2;grap > 0;grap /= 2){
            for(i = 0;i < grap;i++){
                for(j = i + grap;j < N;j += grap){
                    if(arr[j] < arr[j - grap]){
                        int temp = arr[j];
                        int k = j - grap;
                        while(k >= 0 && arr[k] > temp){
                            arr[k + grap] = arr[k];
                            k -= grap;
                        }
                        arr[k + grap] = temp;
                    }
                }
            }
        }
        return arr;
    }
}
