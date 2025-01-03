package ictgharbia.lectureseven.lecture.book;

public class Story extends Book {

    double shippingCosts;
    double printingCosts;


    Story() {
        System.out.println("I am the Story");
        System.out.println(this.title);
    }

    Story(double price){
        super(price);
    }

    public Story(int year, String publisher, String author, String title) {
//        super();
        super(year, title);
//        super(2025, "Dar Egypt", "Ahmed Shawky", "Al Ayam","doi",25030, 500);
        this.publisher = publisher;
        this.author = author;
    }

    public Story(int year, String title){
        super(year, title);
    }

    public Story(double price, double shippingPrice, double printingPrice){
        totalPrice = price;
        shippingCosts = shippingPrice;
        printingCosts = printingPrice;
    }

    public void printStory() {
        System.out.println(
                this.year + " " + this.title
        );
    }


    public void printAllStory(){
        System.out.println(
                this.year + " " + this.title + " " + this.publisher + " " + this.author + " " + this.ispn
        );
    }

    // applying polymorphism --> define method overriding -> method overloading
    public void printPrice(){
        this.totalPrice += (this.shippingCosts + this.printingCosts);
        System.out.println(
                "Story Price including shipping and printing: " +
                        this.totalPrice
        );
    }


}
