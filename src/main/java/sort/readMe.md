排序算法
1。快速排序
    通过一趟排序将待排序记录分割成独立的两部分，其中一部分记录的关键字均比另一部分关键字小，则分别对这两部分继续进行排序，直到整个序列有序。
    把整个序列看做一个数组，把第零个位置看做中轴，和最后一个比，如果比它小交换，比它大不做任何处理；交换了以后再和小的那端比，比它小不交换，比他大交换。这样循环往复，一趟排序完成，左边就是比中轴小的，右边就是比中轴大的，然后再用分治法，分别对这两个独立的数组进行排序。
    快速排序是通常被认为在同数量级（O(nlog2n)）的排序方法中平均性能最好的。但若初始序列按关键码有序或基本有序时，快排序反而蜕化为冒泡排序。为改进之，通常以“三者取中法”来选取基准记录，即将排序区间的两个端点与中点三个记录关键码居中的调整为支点记录。快速排序是一个不稳定的排序方法。
2。冒泡排序
    49 38 65 97 76 13 27  i=0 j=0
    38 49 65 76 13 27     i=1
    38 49 65 13 27        i=2
    38 49 13 27           i=3
    38 13 27              i=4
    13 27                 i=5
    
    冒泡排序
         * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。  
         * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。  
         * 针对所有的元素重复以上的步骤，除了最后一个。
         * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。 
         * @param numbers 需要排序的整型数组
         */
    
3。