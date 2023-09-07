import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _ArrayList {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.stream().forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 1, 2, 3, 5, 1, 1);
        List<Integer> squaredNumbers = numbers.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(squaredNumbers);

        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);

        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctNumbers);

        List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNumbers);

        List<Integer> limitedNumbers = numbers.stream().limit(3).collect(Collectors.toList());
        System.out.println(limitedNumbers);

        List<Integer> skippedNumbers = numbers.stream().skip(20).collect(Collectors.toList());
        System.out.println(numbers);
        System.out.println(skippedNumbers);

        boolean anyEven = numbers.stream().anyMatch(n -> n % 2 == 0);
        boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);
        boolean noneNegative = numbers.stream().noneMatch(n -> n < 0);
        System.out.println(anyEven);
        System.out.println(allEven);
        System.out.println(noneNegative);
        

    }
}
