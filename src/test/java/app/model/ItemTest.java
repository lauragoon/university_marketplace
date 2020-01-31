package app.model;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.Date;
import java.util.HashSet;
import java.util.UUID;

public class ItemTest {


    @Test
    public void testEmptyEquality() {
        User Ayo = new User("Ayo", UUID.randomUUID(), new HashSet<Item>(), new HashSet<Item>());
        Date date = new Date();
        Item item1 = new Item("book", Ayo, 1, date, null);
        Item item2 = new Item("book", Ayo, 1, date, null);

        Assert.assertEquals(item1, item2);
    }


    @Test
    public void testAdd_UserSellingItems() {
        User Ayo = new User("Ayo", UUID.randomUUID(), new HashSet<Item>(), new HashSet<Item>());
        Date date = new Date();
        Item item1 = new Item("book", Ayo, 1, date, new HashSet<User>());
        Item item2 = new Item("book", Ayo, 1, date, new HashSet<User>());

        Ayo.addInterestedItem(item1);
        Ayo.addInterestedItem(item2);

        HashSet<Item> set = new HashSet<>();
        set.add(new Item(item1));
        set.add(new Item(item2));

        Assert.assertEquals(set, Ayo.getInterestedItems());
    }
    @Test
    public void testSize_UserSellingItems() {
        User Ayo = new User("Ayo", UUID.randomUUID(), new HashSet<Item>(), new HashSet<Item>());
        Date date = new Date();
        Item item1 = new Item("book", Ayo, 1, date, new HashSet<User>());
        Item item2 = new Item("chair", Ayo, 1, date, new HashSet<User>());

        Ayo.addInterestedItem(item1);
        Ayo.addInterestedItem(item2);

        Assert.assertEquals(Ayo.getInterestedItems().size(), 2);
    }
    // test that the set of two items is equal to ayo's items
    // check date equality
    // test interested

    @Test
    public void testRemove_UserSellingItems() {
        User Ayo = new User("Ayo", UUID.randomUUID(), new HashSet<Item>(), new HashSet<Item>());
        Date date = new Date();
        Item item1 = new Item("book", Ayo, 1, date, new HashSet<User>());
        Item item2 = new Item("book", Ayo, 1, date, new HashSet<User>());

        Ayo.addInterestedItem(item1);
        Ayo.addInterestedItem(item2);
        Ayo.removeInterestedItem(item1);

        HashSet<Item> set = new HashSet<>();
        set.add(new Item(item1));
        set.add(new Item(item2));

        Assert.assertNotEquals(set, Ayo.getInterestedItems());
    }
    @Test
    public void testNotEmptyEquality() {

    }
}
