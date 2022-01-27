import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PairsOfWords {

    static List<String> pronouns = Arrays.asList("he", "she", "they");
    static List<String> verbs = Arrays.asList("ran", "walked", "stood", "crawled");
    static List<String> adverbs = Arrays.asList("home", "away");

    // What does flatmap do?
    // Stream.flatMap() helps in converting Stream<Collection<T>> to Stream<T>.
    // for example:
    // Before flattening :  [[1,2,3],[4,5],[6,7,8,9]]
    // After flattering :   [1,2,3,4,5,6,7,8,9]

    public static void main(String[] args) {
        part1();
        part2();
        part3();
        part4();
    }

    private static void part4() {

        var output = pronouns.stream()
                .flatMap(pronoun -> verbs.stream()
                        .flatMap(verb -> adverbs.stream()
                                .map(adverb -> Arrays.asList(pronoun, verb, adverb))))
                .collect(Collectors.toList());

        output.forEach(item -> System.out.println(item.get(0) + " " + item.get(1) + " " + item.get(2)));
    }

    private static void part3() {
        var output = pronouns.stream().flatMap(pronoun ->{
            return verbs.stream().map(verb -> Arrays.asList(pronoun, verb));
        }).collect(Collectors.toList());

        System.out.println(output);

        var output1 = pronouns.stream()
                .flatMap(pronoun -> verbs.stream()
                        .map(verb -> Arrays.asList(pronoun, verb)))
                .collect(Collectors.toList());
    }

    private static void part2() {
        var output = pronouns.stream().map(pronoun -> {
            return verbs.stream().map(verb -> Arrays.asList(pronoun, verb)).collect(Collectors.toList());
        }).collect(Collectors.toList());

        System.out.println(output);

        var output1 = pronouns.stream()
                .map(pronoun -> verbs.stream()
                        .map(verb -> Arrays.asList())
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());
    }

    private static void part1() {
        System.out.println(verbs);
        System.out.println(pronouns);
        System.out.println(adverbs);
    }

}
