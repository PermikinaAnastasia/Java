import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class ListDemoTest {
    @Test
    public void testfirstSymbolMatchesCount() {
        List<String> testList = new ArrayList<>();
        testList.add("kpk");
        testList.add("sao");
        testList.add("sad");
        testList.add("kkk");
        assertEquals(2, ListDemo.firstSymbolMatchesCount(testList, 's'));
    }

    @Test
    public void testGetNamesakes() {
        List<Human> list = new ArrayList<>();
        Human human = new Human("Viktor", "Petrovich", "Ivanov", 55);
        Human human2 = new Human("Ivan", "Nikolaevich", "Pupkin", 21);
        Human human3 = new Human("Andrey", "Vladimirovich", "Pupkin", 8);
        list.add(human);
        list.add(human3);
        assertEquals(1, ListDemo.getNamesakes(list, human2).size());
        assertEquals(human3, ListDemo.getNamesakes(list, human2).get(0));
    }

    @Test
    public void testRemoveHumanFromList()  {
        List<Human> list = new ArrayList<>();
        Human human = new Human("Viktor", "Petrovich", "Ivanov", 55);
        Human human2 = new Human("Ivan", "Nikolaevich", "Pupkin", 21);
        Human human3 = new Human("Andrey", "Vladimirovich", "Pupkin", 8);
        list.add(human);
        list.add(human3);
        list.add(human2);
        List<Human> newList = ListDemo.removeHumanFromList(list, human2);
        list.removeAll(newList);
        assertEquals(1, list.size());
        assertEquals(human2, list.get(0));
    }


    @Test
    public void testGetListOfSetWithAnEmptyIntersection() {
        List<Set<Integer>> list = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(1);
        set2.add(2);
        set2.add(4);
        list.add(set1);
        list.add(set2);
        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(50);
        set.add(7);
        assertEquals(1, ListDemo.getListOfSetWithAnEmptyIntersection(list, set).size());
        assertEquals(set2, ListDemo.getListOfSetWithAnEmptyIntersection(list, set).get(0));
    }


    @Test
    public void testGetPeopleById()  {
        Map<Integer, Human> map = new HashMap<>();
        Human a = new Human("A", "B", "C", 55);
        Human b = new Human("A", "B", "D", 21);
        Human c = new Human("A", "B", "E", 8);
        map.put(1, a);
        map.put(2, b);
        map.put(3, c);
        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(1);
        Set<Human> checkSet = new HashSet<>();
        checkSet.add(a);
        checkSet.add(c);
        assertEquals(checkSet, ListDemo.getPeopleById(map, set));
    }

    @Test
    public void testGet18Years() {

        Map<Integer, Human> map = new HashMap<>();
        Human a = new Human("A", "B", "C", 55);
        Human b = new Human("A", "B", "D", 21);
        Human c = new Human("A", "B", "E", 8);
        map.put(1, a);
        map.put(2, b);
        map.put(3, c);
        List<Integer> check = new ArrayList<>();
        check.add(1);
        check.add(2);
        assertEquals(check, ListDemo.getAtList18YearsOldIds(map));
    }

}