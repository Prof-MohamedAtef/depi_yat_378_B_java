package yatzaqziq.lecturesix.lecture;

public class Book {
    private String authorName;
    private String title;
    private String publisher;

    public Book(String authorName, String title, String publisher) {
        this.authorName = authorName;
        this.title = title;
        this.publisher = publisher;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }
}