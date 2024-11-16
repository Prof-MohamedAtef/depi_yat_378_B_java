package ictgharbia.lectureseven.lecture;

public class Book {
    int pages;
    int ispn;
    String doi;
    String title;
    String author;
    String publisher;
    int year;

    double totalPrice;


    public Book() {
        System.out.println("I am the Book|Default Constructor");
    }

    public Book(int year, String publisher, String author, String title, String doi, int ispn, int pages) {
        this.year = year;
        this.publisher = publisher;
        this.author = author;
        this.title = title;
        this.doi = doi;
        this.ispn = ispn;
        this.pages = pages;
        System.out.println("I am the Book |Passing 7 arguments");
    }

    public Book(int year, String title) {
        this.year = year;
        this.title = title;
        System.out.println("I am The Book|Parameterized Constructor: 2");
    }

    public Book(double price) {
        this.totalPrice = price;
    }

    public void printBook() {
        System.out.println("Title: " + title);
    }

    public void printPrice() {
        System.out.println(
                "Total Price: " + this.totalPrice
        );
    }
}
