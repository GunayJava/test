package model;

public class User {
    private static int nextId=1;
    private int id;
    private Parking bill;

    {
        id=nextId;
        nextId++;
    }

    public User() {
    }

    public User( Parking bill) {
        this.bill = bill;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Parking getBill() {
        return bill;
    }

    public void setBill(Parking bill) {
        this.bill = bill;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + nextId +
                ", bill=" + bill +
                '}';
    }
}
