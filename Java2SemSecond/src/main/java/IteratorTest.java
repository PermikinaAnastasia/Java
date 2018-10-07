public class IteratorTest {

    public static void main(String[] arg) {
        Data data = new Data("A", new Group(101, 1, 4, 7), new Group(102, 2, 3, 5, 6),
                new Group(103, 11, 4));
        DataIterator it = new DataIterator(data);
        while (it.hasNext()) {
            System.out.print(it.next());
            System.out.print(" ");
        }
    }
}
