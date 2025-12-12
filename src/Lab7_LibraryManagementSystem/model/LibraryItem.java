package Lab7_LibraryManagementSystem.model;

public abstract class LibraryItem {
    private int id;
    private String title;


    public LibraryItem(int id, String title) {
        this.title = title;
        this.id = id;
    }

    public abstract String getItemDetails();

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
