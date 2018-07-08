package LambdaBook;

import org.junit.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class Test1Test {

    @Test
    public void testLambdaMap() {

        ArrayList<String> colllected = new ArrayList<>();
        for (String string : Arrays.asList("a", "b", "Hello")) {

            String upperCaseString = string.toUpperCase();
            colllected.add(upperCaseString);
        }

        assertEquals(Arrays.asList("A", "B", "HELLO"), colllected);


        List<String> collected1 = Stream.of("a","b","hello")
                .map(String::toUpperCase).collect(Collectors.toList());

        assertEquals(Arrays.asList("A", "B", "HELLO"), collected1);

        List<String> collected2 = Stream.of("a", "1b", "1hello")
                .filter(value -> Character.isDigit(value.charAt(0)))
                .collect(Collectors.toList());

        List<Integer> together = Stream.of(Arrays.asList(4, 2), Arrays.asList(1, 3))
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        together.stream().filter(value -> value >2).forEach(System.out::println);
        System.out.println(together.stream()
                .min(Integer::compareTo)
                .get());


        Function<Integer, String> intplusToString = intval -> String.valueOf(intval + 5);
        Function<Integer, String> intToString = intval -> intval.toString();
        assertEquals("10", intplusToString.apply(5));
        assertEquals("5", intToString.apply(5));

    }

    @Test
    public void testJava8() {
        assertEquals(Optional.of(Optional.of("STRING")),
                Optional
                        .of("string")
                        .map(s -> Optional.of("STRING")));

        assertEquals(Optional.of("STRING"), Optional
                .of("string")
                .flatMap(s -> Optional.of("STRING")));
    }



}