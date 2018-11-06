package sort;

/**
 * 冒泡
 */
public class BubbleSort {

    public static int[] bubbleSort(int[] intArr){
        int temp=0;
        for(int i=0;i<intArr.length-1;i++){
            for(int j=0;j<intArr.length-1-i;j++){
                if(intArr[j] > intArr[j+1]){
                    temp = intArr[j];
                    intArr[j] = intArr[j+1];
                    intArr[j+1] = temp;
                }
            }
        }
        return intArr;
    }
}
