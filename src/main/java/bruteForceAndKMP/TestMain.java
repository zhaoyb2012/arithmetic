package bruteForceAndKMP;

import java.util.Arrays;

public class TestMain {

    public static void main(String[] args) {
        String str1 = "abcdefgh";
        String str2 = "efg";

        String str3 = "aaaaaaab";
        String sub = "aaaab";

        System.out.println(BruteForce.bruteForce(str1, str2));

        System.out.println(Arrays.toString(KMP.getNext("aaeaab")));

        System.out.println(Arrays.toString(KMP.getNext(sub)));

        System.out.println(KMP.kmp(str1, str2));
    }
}
