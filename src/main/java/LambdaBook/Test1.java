package LambdaBook;

import java.util.*;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Test1 {
    public static void main(String[] args) {

/*
        Map<String, Integer> nameMap = new HashMap<>();
        Integer value = nameMap.computeIfAbsent("Petya", s -> s.length());
        Integer value1 = nameMap.computeIfAbsent("George", s -> s.length());

        nameMap.forEach((k, v) -> System.out.println(k + " " + v));


        Function<Integer, String> intplusToString = intval -> String.valueOf(intval + 5);
        Function<Integer, String> intToString = intval -> intval.toString();
        System.out.println("10".equals(intplusToString.apply(5)));
        System.out.println("5".equals(intToString.apply(5)));


        short[] array = {(short) 1, (short) 2, (short) 3};
        byte[] transformedArray = trasformArray(array, s -> (byte) (s * 2));
        for (byte b : transformedArray) {
            System.out.println(b);
        }*/


        Map<String, Integer> salaries = new HashMap<>();
        salaries.put("John", 40000);
        salaries.put("Freddy", 30000);
        salaries.put("Samuel", 50000);

        salaries.replaceAll((name, oldValue) ->
                name.equals("Freddy") ? oldValue : oldValue + 10000);

        System.out.println(salaries);


        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());

        List<String> list1 = Arrays.asList("abc", "qwe", "wtf");
        List<String> list2 = Arrays.asList("abc", "qwe", "wtf");
        List<String> list3 = Arrays.asList("qwe", "abc", "wtf");

        System.out.println(list1.equals(list2));
        System.out.println(list1.equals(list3));


        Map<String, Integer> hashMap = new LinkedHashMap<>();

        hashMap.put("RED", 2);
        hashMap.put("BLACK", null);
        hashMap.put("BLUE", 1);
        hashMap.put("GREEN", 3);
        hashMap.put("WHITE", null);

        // using Map.values() + removeIf()
        hashMap.values().removeIf(Objects::isNull);

        LinkedHashMap<String, Integer> sortedDates = hashMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new));

        System.out.println(sortedDates);
        System.out.println(hashMap);


        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        System.out.println(names);
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });


        System.out.println(names);
    }

    public static byte[] trasformArray(short[] array, ShortToByteFunction function){

        byte[] transformedArray =  new byte[array.length];
        for(int i = 0; i<array.length; i++) {
            transformedArray[i] = function.applyAsByte(array[i]);

        }
        return transformedArray;
    }
}
