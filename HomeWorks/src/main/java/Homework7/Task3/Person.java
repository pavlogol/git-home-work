package Homework7.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Person {
    String firstName;
    String lastName;
    int age;


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static <T> Predicate<T> distinctByKey(
            Function<? super T, ?> keyExtractor) {

        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

    //Print all unique names from the list for adults. Result should be in upper case and without any special character (e.g., whitespace).
    //Example: ["PETER","PAUL","ARNOLD","AARON"]
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Peter", "Patterson", 21));
        personList.add(new Person("Paul", "Walker", 31));
        personList.add(new Person("Steve", "Runner", 17));
        personList.add(new Person("Arnold", "", -1));
        personList.add(new Person(" ", "Stevenson", 19));
        personList.add(new Person("   ", "Stevenson", 19));
        personList.add(new Person("      ", "Stevenson", 19));
        personList.add(new Person(" Arnold", "Stevenson", 19));
        personList.add(null);
        personList.add(new Person("Aaron", "Bortnicker", 18));

        List<String> personListFiltered =
                personList.stream()
                        .filter(o -> o != null)
                        .filter(a -> a.getAge() >= 18)
                        .filter(distinctByKey(p -> p.getFirstName()))
                        .map(s -> s.getFirstName().toUpperCase().replaceAll("[^\\p{Alnum}_]|^_|_$", ""))
                        .filter(s -> !s.isEmpty())
                        .collect(Collectors.toList());

        System.out.println(personListFiltered);
    }
}
