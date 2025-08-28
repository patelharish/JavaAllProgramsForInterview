package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterStringsWithStart {
    public static void main(String[] args) {
        String[] str = {"Harish","Anuj","Aswini","Ajay","Dharni","Hariom","Hanshika"};

        // using filter only
        List<String> filter = Arrays.stream(str).filter(s -> s.startsWith("A")).collect(Collectors.toList());

        System.out.println(filter);

        //using foreach
        Arrays.stream(str).filter(s -> s.startsWith("A")).forEach(s -> System.out.print(s+" "));

        System.out.println();

        Arrays.stream(str).filter(s->s.startsWith("H")).forEach(System.out::println);

        //using set
        Set<String> hkp = Arrays.stream(str).filter(s->s.startsWith("H")).collect(Collectors.toSet());
        System.out.println(hkp);

        //using parallel stream
        List<String> lis = Arrays.stream(str).parallel().filter(s->s.startsWith("A")).collect(Collectors.toList());
        System.out.println(lis);

    }
}
