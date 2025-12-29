package day1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(4,5,6,7,8);
        List<String> strings = Arrays.asList("aravind","kumar","s");

        //Find the common element in two list
        list1.stream()
                .filter(list2::contains)
                .forEach(System.out::println);

        //string list to map with string length values
        Map<String, Integer> collect = strings.stream()
                .collect(Collectors.toMap(
                        x -> x,
                        String::length
                ));
        System.out.println(collect);

    }
}
