package app.model;

import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;

/**
 * Defines a user
 */
public class User {
    private String name;
    private UUID user_id;
    private ArrayList<Item> sellingItems;
    private ArrayList<Item> interestedItems;

    public User(String name, UUID user_id, ArrayList<Item> sellingItems, ArrayList<Item> interestedItems) {
        this.name = name;
        this.user_id = user_id;
        this.sellingItems = sellingItems;
        this.interestedItems = interestedItems;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getUser_id() {
        return user_id;
    }

    public void setUser_id(UUID user_id) {
        this.user_id = user_id;
    }

    public ArrayList<Item> getSellingItems() {
        return sellingItems;
    }

    public void setSellingItems(ArrayList<Item> sellingItems) {
        this.sellingItems = sellingItems;
    }

    public ArrayList<Item> getInterestedItems() {
        return interestedItems;
    }

    public void setInterestedItems(ArrayList<Item> interestedItems) {
        this.interestedItems = interestedItems;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", user_id=" + user_id +
                ", sellingItems=" + sellingItems +
                ", interestedItems=" + interestedItems +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(user_id, user.user_id) &&
                Objects.equals(sellingItems, user.sellingItems) &&
                Objects.equals(interestedItems, user.interestedItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, user_id, sellingItems, interestedItems);
    }

    /**
     * Add selling item.
     * @param item: item to add
     * @return true, if operation is successful. False, otherwise
     */
   public boolean addSellingItem(Item item) {
        return this.getSellingItems().add(item);
   }

    /**
     * Add selling item.
     * @param item: item with user interest
     * @return true, if operation is successful. False, otherwise
     */
    public boolean addInterestedItem(Item item) {
        return this.getInterestedItems().add(item);
    }

    /**
     * Add selling item.
     * @param item: item to add
     * @return true, if operation is successful. False, otherwise
     */
    public boolean removeSellingItem(Item item) {
        return this.getSellingItems().remove(item);
    }

    /**
     * Add selling item.
     * @param item: item to add
     * @return true, if operation is successful. False, otherwise
     */
    public boolean removeInterestedItem(Item item) {
        return this.getInterestedItems().remove(item);
    }

}
