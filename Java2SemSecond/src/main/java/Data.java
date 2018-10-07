public class Data {
    private String name;
    private Group[] groups;

    public Data(String name, Group...groups) {
        this.name = name;
        this.groups = groups;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group[] getGroups() {
        return groups;
    }


    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public int getLength() {
        return groups.length;
    }

    public DataIterator iterator() {
        return new DataIterator(this);
    }
}

