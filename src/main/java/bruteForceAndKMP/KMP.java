package bruteForceAndKMP;

/**
 * 模式串求最大真子集
 * 例如 求 aaaab next[j]
 */
public class KMP {

    public static int[] getNext(String sub){
        int j=1,k=0;
        int[] next = new int[sub.length()];
        next[0] = -1;
        next[1] = 0;
        while (j<sub.length()-1){
            if(sub.charAt(j) == sub.charAt(k)){
                next[j+1] = k+1;
                j++;
                k++;
            }else if(k==0){
                next[j+1] = 0;
                j++;
            }else{
                k=next[k];
            }
        }
        return next;
    }

    public static int kmp(String src,String sub){
        int[] next = getNext(sub);
        int i=0,j=0,index=-1;
        while(i<src.length() && j<sub.length()){
            if(src.charAt(i) == sub.charAt(j)){
                i++;
                j++;
            }else if(j==0){
                i++;
            }else{
                j=next[j];
            }

            if(j==sub.length()){
                index=i-sub.length();
            }
        }
        return index;
    }
}
