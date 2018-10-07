import java.util.ArrayList;
import java.util.List;

public class DataDemo {
    public static List<Integer> getAll (Data data) {
        List<Integer> list = new ArrayList<>();
        DataIterator it = // data.iterator();
                new DataIterator(data);

        while (it.hasNext()) {
            list.add(it.next());
        }
        return list;
    }
}
