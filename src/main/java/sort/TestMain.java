package sort;

import java.util.Arrays;

public class TestMain {

    public static void main(String[] args) {
        int[] intArr = new int[]{49,38,65,97,76,13,27};
        System.out.println(Arrays.toString(BubbleSort.bubbleSort(new int[]{5, 3, 6, 2, 1, 8, 7})));
        System.out.println(QuickSort.getMiddle(intArr, 0, intArr.length - 1));

//        if(intArr.length>0){
//            QuickSort.quickSort(intArr,0,intArr.length-1);
//            System.out.println(Arrays.toString(intArr));
//        }

        if(intArr.length>0){
            SelectSort.selectSort(intArr);
            System.out.println(Arrays.toString(intArr));
        }
    }
}
