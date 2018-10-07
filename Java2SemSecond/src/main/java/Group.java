public class Group {
    private int id;
    private int[] data;

    public Group(int id, int...data) {
        this.id = id;
        this.data = new int[data.length];
        System.arraycopy(data, 0, this.data, 0, data.length);
    }

    public Group(int id, int size){
        this.id = id;
        int[] arr = new int[size];
        for (int value : arr){
            value = 0;
        }
        this.data =  arr;

    }

    /*public Group(int id){
        this.id = id;
        int[] arr = new int[]{1,2,3};
        this.data =  arr;

    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = new int[data.length];
        System.arraycopy(data, 0, this.data, 0, data.length);
    }

    public int getLength() {
        return data.length;
    }
}
