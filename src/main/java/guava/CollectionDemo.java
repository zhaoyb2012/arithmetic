package guava;


import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionDemo {


    public static void main(String[] args) {
        List<String> list = Lists.newArrayList("010", "020", "031");

        List<String> tempList = list.stream().map(str -> "'" + str + "',").collect(Collectors.toList());

        for (String str : tempList) {
            System.out.println(str);
        }

        Optional<String> temp = list.stream().map(str->"'"+str+"'").reduce((a, b)->a+","+b);

        temp.orElse("");
        System.out.println(temp.get());

        String s1 = "123";
        String s2 = "456";
    }

    public static String getStr(String str1,String str2){
        return str1+","+str2;
    }

}



