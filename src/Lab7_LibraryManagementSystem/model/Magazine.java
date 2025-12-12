package Lab7_LibraryManagementSystem.model;

public class Magazine extends LibraryItem{
    private String author;
    private int issueNumber;

    public Magazine(int id, String title, String author, int issueNumber) {
        super(id, title);
        this.author = author;
        this.issueNumber = issueNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public String getItemDetails() {
        return getId() + "," + getTitle() + "," + getAuthor() + getIssueNumber();
    }

    @Override
    public String toString(){
        return getId() + "|\n" + "title: " + getTitle() + "\n" +
                "Author: " + getAuthor() + "\n" + "IssueNumber: " + getIssueNumber();
    }


}
