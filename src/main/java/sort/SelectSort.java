package sort;

/**
 * 选择排序
 */
public class SelectSort {

    public static void selectSort(int[] sortArr){
        int size = sortArr.length;
        int temp = 0;

        for(int i=0;i<sortArr.length;i++){
            int k= i;//定位标示，找到的就放到第i位
            for(int j=size-1;j>i;j--){
                if(sortArr[k]>sortArr[j]){
                    k=j;
                }
            }
            temp = sortArr[i];
            sortArr[i] = sortArr[k];
            sortArr[k] = temp;
        }
    }
}
