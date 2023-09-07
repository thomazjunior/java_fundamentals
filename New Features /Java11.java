import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java11 {
    public static void main(String[] args) {
        // New String Methods: isBlank, lines, strip, stripLeading, stripTrailing and
        // repeat.
        String multilineString = "Baeldung Helps \n \n developers \n explore Java.";
        List<String> lines = multilineString.lines()
                .filter(line -> !line.isBlank())
                .map(String::strip)
                .collect(Collectors.toList());

        System.out.println(lines);

        try {
            // Specify the directory where you want to create the temporary file
            String userHome = System.getProperty("user.home");
            Path directory = Path.of(userHome + "/projects");

            // Create a temporary file with a prefix, suffix, and initial content
            Path filePath = Files.createTempFile(directory, "demo", ".txt");
            String content = "Sample text";
            Files.writeString(filePath, content);

            System.out.println("Temporary file created at: " + filePath);
            System.out.println(Files.readString(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Collection to array
        List<String> sampleList = Arrays.asList("Java", "Kotlin");
        String[] sampleArray = sampleList.toArray(String[]::new);
        System.out.println(sampleArray);

        // Not predicate method
        List<String> sampleList2 = Arrays.asList("Java", "\n \n", "Kotlin", " ");
        List withoutBlanks = sampleList2.stream()
                .filter(Predicate.not((String::isBlank)))
                .collect(Collectors.toList());
        System.out.println(withoutBlanks);

        // Local-Variable Syntax for Lambda
        List<String> sampleList3 = Arrays.asList("Java", "Kotlin");
        String resultString = sampleList3.stream()
                .map((var x) -> x.toUpperCase())
                .collect(Collectors.joining(", "));
        System.out.println(resultString);

        // HTTPClient introduced in Java 9 and now become a standard feature
        HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .connectTimeout(Duration.ofSeconds(20))
                .build();

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("http://192.168.120.214:8080"))
                .build();

        try {
            HttpResponse httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println(httpResponse);
        } catch (IOException | InterruptedException e) {

            e.printStackTrace();
        }

        //Nest based access control
        Set<String> nestedMembers = Arrays.stream(Java11.class.getNestMembers())
                .map(Class::getName)
                .collect(Collectors.toSet());
        
        System.out.println(nestedMembers);
        



    }
}
