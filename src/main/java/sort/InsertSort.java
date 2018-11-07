package sort;

import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertSort {

/**
* 插入排序
*
* 从第一个元素开始，该元素可以认为已经被排序
* 取出下一个元素，在已经排序的元素序列中从后向前扫描
* 如果该元素（已排序）大于新元素，将该元素移到下一位置
* 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
* 将新元素插入到该位置中
* 重复步骤2
* */
    public static void inserSort(int[] intArr) {
        int size = intArr.length;
        int temp=0;
        int j =0;
        for(int i=1;i<size;i++){
            temp = intArr[i];
            for(j=i;j>0&&temp<intArr[j-1];j--){
                intArr[j] = intArr[j-1];
            }
            intArr[j] = temp;
            System.out.println(Arrays.toString(intArr));
        }
    }

//    {49,38,65,97,76,13,27}
}
