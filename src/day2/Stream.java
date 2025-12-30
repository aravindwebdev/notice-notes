package day2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 5000),
                new Employee("Bob", 3000),
                new Employee("Charlie", 4000));

        Set<Employee> collect = employees.stream()
                .sorted(Comparator.comparing(i -> i.salary))
                .collect(Collectors.toSet());

        System.out.println(collect);

    }
}
