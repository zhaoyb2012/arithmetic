package sort;

/**
 * 快速
 */
public class QuickSort {

    public static int getMiddle(int[] intArr,int low,int high){
        int temp = intArr[low];
        while (low<high){
            while (low<high && intArr[high]>temp){
                high--;
            }
            intArr[low] = intArr[high];
            while (low<high && intArr[low]<temp){
                low++;
            }
            intArr[high] = intArr[low];
        }
        intArr[low] = temp;
        return low;
    }

    public static void quickSort(int[] intArr,int low,int high){
        if(low < high){
            int middle = getMiddle(intArr,low,high);
            quickSort(intArr,low,middle-1);
            quickSort(intArr,middle+1,high);
        }
    }

    /***********快速排序优化**************/
    public static int partition(int[] intArr,int low,int high){
        int mid = low + (high-low)/2;
        if(intArr[mid]>intArr[high]){
            swap(intArr[mid],intArr[high]);
        }
        if(intArr[low] > intArr[high]){
            swap(intArr[low],intArr[high]);
        }
        if(intArr[mid]>intArr[low]){
            swap(intArr[mid],intArr[low]);
        }
        int key =intArr[low];

        while (low<high){
            while (intArr[high]>=key&&high>low){
                high--;
            }
            intArr[low] =intArr[high];
            while (intArr[low]<=key&&high>low){
                low++;
            }
            intArr[high]=intArr[low];
        }
        intArr[high] = key;
        return high;

    }

    private static void swap(int low, int high) {
        int temp = low;
        high = low;
        low = temp;
    }
}
