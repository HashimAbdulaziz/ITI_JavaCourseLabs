package Lab7_LibraryManagementSystem.model;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private int id;
    private String name;
    private String email;
    private List<LibraryItem> borrowedItems = new ArrayList<>();

    public Client(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getClientDetails(){
        return getId() + "," + getName() + "," + getEmail();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return getClientDetails();
    }

    // Added methods
    public void borrowItem(LibraryItem item) {
        borrowedItems.add(item);
    }

    public void returnItem(LibraryItem item) {
        borrowedItems.remove(item);
    }

    public List<LibraryItem> getBorrowedItems() {
        return borrowedItems;
    }
}