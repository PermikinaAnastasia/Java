public class DataIterator {
    private Data data;
    private int currentGroup = 0;
    private int currentNumber = -1;

    public DataIterator(Data data) {
        this.data = data;
    }

    public int next() {
        if (data.getGroups()[currentGroup].getLength() > currentNumber + 1) {
            currentNumber++;
            return data.getGroups()[currentGroup].getData()[currentNumber];
        } else {
            currentGroup++;
            currentNumber = 0;
            return data.getGroups()[currentGroup].getData()[currentNumber];
        }
    }

    public boolean hasNext() {
        return data.getGroups().length != 0 && (currentGroup < data.getLength() - 1 ||
                currentNumber < data.getGroups()[currentGroup].getLength() - 1);
    }
}
