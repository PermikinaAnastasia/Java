package Permikina;
//import Human.Human;
//import Student.Student;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReflectionDemoTest {
    @Test
    public void testGetCountOfHumanAndDerives() {
        List<Object> list = new ArrayList<Object>() {{
            add(new Object());
            add(new Object());
            add(new Permikina.Human());
            add(new Object());
            add(new Permikina.Student("2", "2", "2", 10, "2"));
            add(new Permikina.Student("2", "2", "2", 10, "2"));
            add(new Permikina.Human());
        }};
        Assert.assertEquals(4, Permikina.ReflectionDemo.getCountOfHumanAndDerives(list));
    }


    @Test
    public void testGetNamesOfPublicMethods1() {
        Object o = new Object();
        List<String> expected = new LinkedList<String>() {{
            add("getClass");
            add("equals");
            add("hashCode");
            add("toString");
            add("notify");
            add("notifyAll");
            add("wait");

        }};
        List<String> actual = Permikina.ReflectionDemo.getNamesOfPublicMethods(o);
        Assert.assertTrue(actual.containsAll(expected));
        Assert.assertNotEquals(actual.size(), expected.size());
    }

    @Test
    public void testGetAllSuperclasses() {
        Permikina.Student student = new Permikina.Student("", "", "", 0, "");
        List<String> expected = new LinkedList<String>() {{
            add("Permikina.Human");
            add("java.lang.Object");
        }};
        List<String> actual = Permikina.ReflectionDemo.getAllSuperclasses(student);
        Assert.assertEquals(expected, actual);
    }

}