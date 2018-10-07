import org.junit.Test;

import static org.junit.Assert.*;

public class HumanTest {
    @Test
    public void testSetters() {
        Human human = new Human("Ivan", "Ivanovic", "Ivanov", 34);
        human.setFirstName("q");
        human.setMiddleName("w");
        human.setLastName("e");
        human.setAge(65);
        Human h = new Human("q", "w", "e", 65);
        assertEquals(h, human);
    }

}