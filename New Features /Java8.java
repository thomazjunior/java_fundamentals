import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8 {
    // STREAMS - contains classes for processing sequences of elements
    public static void main(String[] args) {
        String[] arr = new String[] { "a", "b", "c", "e", "f", "g", "O", "i", "j", "k" };
        Stream<String> stream = Arrays.stream(arr);
        // Multi-threading with streams
        // stream.forEachOrdered(System.out::println);
        // Intermediate/Terminal operations
        long count = stream.distinct().count();
        // boolean isExist = stream.anyMatch(e -> e.contains("a"));

        // filter
        ArrayList<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        Stream<String> streamResult = list.stream().filter(element -> element.contains("e"));
        streamResult.forEach(System.out::println);

        // map
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8);
        var doubleResult = integerStream.map(v -> v * 2);
        doubleResult.forEach(System.out::println);

        // flatMap
        // # 1 - Map is used for transforming the elements of a stream one-to-one
        List<String> names = List.of("Alice", "Bob", "Charlie");
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // # 2 - flatMap is used when you want to deal with nested structures or flatten
        // a stream of streams
        List<List<Integer>> nestedList = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9));

        List<Integer> flattenedList = nestedList.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        // Matching - anyMatch, allMatch, noneMatch
        boolean isValid = nestedList.stream().anyMatch(e -> e.size() > 2);

        // Reduction
        List<Integer> integers = Arrays.asList(1, 1, 2, 3, 4, 5);
        Integer reduced = integers.stream().reduce(23, (a, b) -> a + b);

        // LAMBDA EXPRESSION AND FUNCTIONAL INTERFACE
        Function<String, String> fn = parameter -> parameter + " from lambda";
        String result = add("Message", fn);
        System.out.println(result);

        //Interface Default and Static Methods 
        //# before Java(8) interfaces could have only public abstract method

        //Method Reference 
        //# Reference to a Static Method - ContainingClass::methodName 
        boolean isReal = list.stream().anyMatch(u -> User.isRealUser(u));
        boolean isReal2 = list.stream().anyMatch(User::isRealUser);

        //# Reference to an Instance Method 
        User user = new User();
        boolean isLegalName = list.stream().anyMatch(user::isLegalName);

        //# Reference to an Instance Method of an Object of a Particular Type 
        long count2 = list.stream().filter(String::isEmpty).count();


        //# Reference to a Constructor 
        Stream<User> stream3 = list.stream().map(User::new);

        //OPTIONAL 
        Optional<String> optional = Optional.empty();

    }

    public static String add(String string, Function<String, String> function) {
        return function.apply(string);
    }



}
