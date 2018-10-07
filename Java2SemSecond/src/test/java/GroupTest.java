import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class GroupTest {
    @Test
    public void testGetSetId(){
        Group g = new Group(3, 1,2,5);
        assertEquals(3, g.getId());
        g.setId(78);
        assertEquals(78, g.getId());
    }

    @Test
    public void testSetData() {
        Group g = new Group(3, 1,2,3,4,5);
        int[] d = new int[]{2,3,4,3};
        g.setData(d);
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(g.getData()));

        assertArrayEquals(d, g.getData());
    }

}