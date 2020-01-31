package app.model;


import java.util.Date;
import java.util.HashSet;
import java.util.Objects;

/**
 * Defines an Item.
 */
public class Item {

    private String name;
    private User seller;
    private long id;
    private Date postDate;
    private HashSet<User> expressedInterest;


    public Item(String name, User seller, long id, Date postDate, HashSet<User> expressedInterest) {
        this.name = name;
        this.seller = seller;
        this.id = id;
        this.postDate = postDate;
        this.expressedInterest = expressedInterest;
    }

    // Copy constructor for testing.
    public Item(Item item) {
        this.name = item.name;
        this.id = item.id;
        User seller = item.getSeller();
        this.seller = new User(seller.getName(), seller.getuserID(), new HashSet<Item>(seller.getSellingItems()),
                new HashSet<Item>(seller.getInterestedItems()));
        this.postDate = new Date(item.getPostDate().getTime());
        this.expressedInterest = new HashSet<>(item.getExpressedInterest());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public HashSet<User> getExpressedInterest() {
        return expressedInterest;
    }

    public void setExpressedInterest(HashSet<User> expressedInterest) {
        this.expressedInterest = expressedInterest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return id == item.id &&
                Objects.equals(name, item.name) &&
                Objects.equals(postDate, item.postDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, postDate);
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", seller=" + seller +
                ", id=" + id +
                ", postDate=" + postDate +
                '}';
    }



}
