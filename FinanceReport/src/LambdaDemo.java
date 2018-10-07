//import java.util.function.BiFunction;
import java.util.function.BiPredicate;
//import java.util.function.Function;
//import java.util.function.Predicate;

public class LambdaDemo {
    public static final Function<String, Integer> getStringLength = String::length;
    public static final Function<String, Character> getFirstChar = s -> s == null ? null : s.charAt(0);
    public static final Function<String, Boolean> isContainSpaces = s -> s.contains(" ");
    public static final Function<Human, Integer> getAge = Human::getAge;
    public static final Function<String, Integer> getWordCount = s -> s.split(",").length;
    public static final TwoHumansPredicate isSameLastName = (h1, h2) -> h1.getLastName().equals(h2.getLastName());
    public static final Function<Human, String> getFullName =
            h ->
                    h.getFirstName() + " " +
                            h.getMiddleName() + " " +
                            h.getLastName();
    public static final Function<Human, Human> incrementAge = h ->
            new Human(h.getFirstName(), h.getMiddleName(), h.getLastName(), h.getAge() + 1, h.getGender());
    public static final ThreeHumansAndIntPredicate areAllYoungerThan =
            (h1, h2, h3, maxAge) -> h1.getAge() < maxAge && h2.getAge() < maxAge && h3.getAge() < maxAge;
}