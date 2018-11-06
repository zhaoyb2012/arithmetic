package bruteForceAndKMP;

import java.util.Arrays;

public class TestMain {

    public static void main(String[] args) {
        String str1 = "abcdeabcfgh";
        String str2 = "efg";

        String str3 = "aaaaaaab";
        String sub = "aaaab";

        System.out.println(BruteForce.bruteForce(str1, str2));

        System.out.println(Arrays.toString(KMP.getNext("aaeaab")));

        System.out.println(Arrays.toString(KMP.getNext(sub)));

        System.out.println(KMP.kmp(str1, str2));

        System.out.println(Arrays.toString(KMP.getNext("abcdbcdf")));



//                 j           k
//        a  b c d e a b c f g h
//        -1 0 0 0 0 0 1 2 3 0 0
    }
}
