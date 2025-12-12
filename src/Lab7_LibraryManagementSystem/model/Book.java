package Lab7_LibraryManagementSystem.model;

public class Book extends LibraryItem{
    private String author;

    public Book(int id,String title, String author) {
        super(id, title);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String getItemDetails() {
        String details = this.getId() + "," + this.getTitle() + "," + getAuthor();
        return details;
    }

    @Override
    public String toString(){
        return getId() + "|\n" + "title: " + getTitle() + "\n" +
                "Author: " + getAuthor();
    }


}
