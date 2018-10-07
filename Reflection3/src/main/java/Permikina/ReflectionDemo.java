package Permikina;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ReflectionDemo {
    public static long getCountOfHumanAndDerives(List<Object> list) {
        return list.stream().filter(Permikina.Human.class::isInstance).count();
    }

    public static List<String> getNamesOfPublicMethods(Object o) {
        return Arrays.stream(o.getClass().getMethods()).map(Method::getName).collect(Collectors.toList());
    }

    public static List<String> getAllSuperclasses(Object o) {
        Class current = o.getClass().getSuperclass();
        List<String> res = new LinkedList<>();
        while (current != null) {
            res.add(current.getName());
            current = current.getSuperclass();
        }
        return res;
    }
}