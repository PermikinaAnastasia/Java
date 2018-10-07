import java.util.*;

public class ListDemo {
    public static int firstSymbolMatchesCount(List<String> lines, char c) {
        int count = 0;
        for (String line : lines)
            if (line.startsWith(String.valueOf(c)))
                count++;
        return count;
    }

    public static List<Human> getNamesakes(List<Human> humans, Human human){
        List<Human> resList = new ArrayList<>();
        for (Human h : humans){
            if (h.getLastName().equals(human.getLastName())){
                resList.add(h);
            }
        }
        return resList;
    }

    public static List<Human> removeHumanFromList(List<Human> humans, Human human){
        List<Human> resList = new ArrayList<>(humans);
        while(resList.remove(human)){};
        return resList;
    }

    public static List<Set<Integer>> getListOfSetWithAnEmptyIntersection(List<Set<Integer>> sets, Set<Integer> set){
        List<Set<Integer>> resList = new ArrayList<>();
        boolean valid;
//        Collections.disjoint()
        for (Set<Integer> s : sets) {
            valid = true;
            for (Integer integer : s){
                if (set.contains(integer)) {
                    valid = false;
                    break;
                }
            }
            if (valid)
                resList.add(s);
        }
        return resList;
    }

    public static Set<Human> getPeopleById (Map<Integer, Human> map, Set<Integer> set) {
        Set<Human> people = new HashSet<>();
        for (Integer i : set) {
            Human human = map.get(i);
            if (human != null) people.add(human);
        }
        return people;
    }

    public static List<Integer> getAtList18YearsOldIds (Map<Integer, Human> map) {
        Set<Map.Entry<Integer, Human>> set = map.entrySet();
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Human> entry : set) {
            if (entry.getValue().getAge() >= 18)
                result.add(entry.getKey());
        }
        return result;
    }
}
