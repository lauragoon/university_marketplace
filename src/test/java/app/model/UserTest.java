package app.model;



import org.junit.Test;

import java.util.HashSet;
import java.util.UUID;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void testEmptyInterestedItem() {
        UUID id = UUID.randomUUID();
        UUID id2 = UUID.randomUUID();
        User Ayo = new User("Ayo", id, new HashSet<Item>(), new HashSet<Item>());
        User Laura = new User("Laura", id2, new HashSet<Item>(), new HashSet<Item>());
        assertEquals(Ayo.getInterestedItems(), Laura.getInterestedItems());
    }

    @Test
    public void testEmptySellingtem() {
        UUID id = UUID.randomUUID();
        UUID id2 = UUID.randomUUID();
        User Ayo = new User("Ayo", id, new HashSet<Item>(), new HashSet<Item>());
        User Laura = new User("Laura", id2, new HashSet<Item>(), new HashSet<Item>());
        assertEquals(Ayo.getSellingItems(), Laura.getSellingItems());
    }



}
