package bruteForceAndKMP;

public class BruteForce {

    public static int bruteForce(String str,String sub){
        int i=0,j=0,index=-1;
        while (i<str.length() && j<sub.length()){
            if(str.charAt(i) == sub.charAt(j)){
                i++;
                j++;
            }else{
                i=i-j+1;
                j=0;
            }
            if(j==sub.length()){
                index = i-sub.length();
            }
        }
        return index;
    }
}
