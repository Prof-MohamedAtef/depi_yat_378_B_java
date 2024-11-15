package yatzaqziq.lectureseven.lecture.books;

public class Book {
    String title;
    String author;
    String isbn;  // default access modifier  -- package private
    protected String publisherName;

    void printTitle() {

    }

    public void calculatePrice(int pages, int pagePrice){
        System.out.println(pages * pagePrice);
    }

    public void calculatePrice(int pages, int pagePrice, double discount){
        System.out.println(pages * pagePrice* discount);
    }
}

