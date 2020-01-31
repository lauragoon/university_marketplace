package app.model;

import com.sun.istack.internal.NotNull;

import java.util.HashSet;
import java.util.Objects;
import java.util.UUID;

/**
 * Defines a user
 */
public class User {
    private String name;
    private UUID userID;
    private HashSet<Item> sellingItems;
    private HashSet<Item> interestedItems;

    public User(@NotNull String name, @NotNull UUID userID,
                @NotNull HashSet<Item> sellingItems, @NotNull HashSet<Item> interestedItems) {

        if (name == "") {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
        this.userID= userID;
        this.sellingItems = sellingItems;
        this.interestedItems = interestedItems;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getuserID() {
        return userID;
    }

    public void setuserID(UUID userID) {
        this.userID = userID;
    }

    public HashSet<Item> getSellingItems() {
        return sellingItems;
    }

    public void setSellingItems(HashSet<Item> sellingItems) {
        this.sellingItems = sellingItems;
    }

    public HashSet<Item> getInterestedItems() {
        return interestedItems;
    }

    public void setInterestedItems(HashSet<Item> interestedItems) {
        this.interestedItems = interestedItems;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", userID=" + userID+
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
                Objects.equals(userID, user.userID) &&
                Objects.equals(sellingItems, user.sellingItems) &&
                Objects.equals(interestedItems, user.interestedItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, userID, sellingItems, interestedItems);
    }

    /**
     * Add selling item.
     * @param item: item to add
     * @return true, if operation is successful. False, otherwise
     */
   public boolean addSellingItem(Item item) {
        item.setSeller(this);
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
        item.setSeller(null);
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
