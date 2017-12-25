package streamVideo;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Сергей", 38));
        persons.add(new Person("Даша", 7));
        persons.add(new Person("Глаша", 3));
        persons.add(new Person("Саша", 6));
        persons.add(new Person("Анна", 18));

        Person person = new Person("Person1", 5);

        Optional<Person> person1 = Optional.of(person);

        if (person1 != null) {
            person1.ifPresent(System.out::println);
        }

        person1.ifPresent(s -> System.out.println(s));



        //   средний возраст среди  старше 18
        double asDouble = persons.stream().filter(p -> p.getAge() >= 18)
                .mapToInt(p -> p.getAge())
                .average()
                .getAsDouble();
        System.out.println(asDouble);


        //имена сорт по имени старше 18
        persons.stream().filter(p -> p.getAge() >= 18)
                .sorted(Comparator.comparing(Person::getName))
                .map(p -> p.getName())
                .forEach(System.out::println);


        //Find Oldest Person
        final Comparator<Person> comp = (p1, p2) -> Integer.compare( p1.getAge(), p2.getAge());
        Person oldest = persons.stream()
                .max(comp)
                .get();

        //Find Youngest Person
        //  -This time instead create the Comparator as the argument to the min() method
        Person youngest = persons.stream()
                .min((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()))
                .get();

        List<Integer> nums = Arrays.asList(new Integer[]{1, 2, 3});
        int sum1 = nums.stream().reduce(0, (acc, element) -> acc + element);
        System.out.println(sum1);


        //identical sums
        int reduce = persons.stream()
                .filter(p -> p.getAge() > 17)
                .mapToInt(Person::getAge)
                .reduce(0, (a, b) -> a + b);
        System.out.println(reduce);

        System.out.println(persons.stream()
                .filter(p -> p.getAge() > 17)
                .mapToInt(Person::getAge)
                .sum());




    }
}
