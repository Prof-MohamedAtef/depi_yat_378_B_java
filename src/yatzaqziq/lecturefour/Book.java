package yatzaqziq.lecturefour;

// class
public class Book {
    // attributes - fields - properties
    String title;
    String author;
    String publisherName;
    int publishYear;
    int pages;
    String coverUrl;

    /*
    functions - methods
    save book
    show book
    delete book
     */

    public void saveBook(String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void showBook(){
        String bookData ="Title: "+ this.title+ "\n" +"Author: " + this.author + "\n" + "Pages: " + pages+

                "\nPublisher Name: " + this.publisherName + "\n" +"Publish Year: " + this.publishYear;
        System.out.println(bookData);
    }

    public void deleteBook(){

    }

}
