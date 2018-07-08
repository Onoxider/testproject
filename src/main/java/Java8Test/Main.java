package Java8Test;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.zip.InflaterInputStream;

public class Main {

    public static void transform(List<Integer> numbers) {
/*        numbers = numbers.stream().filter(i -> i > 0).collect(Collectors.toList());
        System.out.println(numbers);*/
        numbers.removeIf(i -> i < 0);
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = -5; i < 5; i++) {
            list.add(i);
        }
        System.out.println(list);
        transform(list);
        System.out.println(list);


        String key = "key";
        Map<String, Integer> map = new HashMap<>();
        map.put(key, 11);
        map.put("stable", 1111);

/*        map.compute(person, (person1, status) ->person.getAge() > 21 ? Status.ACCEPTED
                : null);*/

        map.computeIfPresent(key, (key1, value) -> value == 10 ? 11 : null);

        System.out.println(map);

        Absclass absclassChild = new AbsclassChild();
        absclassChild.getString();



    }

    String sosihuy() throws IOException {
        try (BufferedReader br =
                     new BufferedReader(new FileReader("C:/sdfdsf"))) {
            return br.readLine();
        }
    }

    static String readFirstLineFromFile(String path) throws IOException {
        try (BufferedReader br =
                     new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }
}
