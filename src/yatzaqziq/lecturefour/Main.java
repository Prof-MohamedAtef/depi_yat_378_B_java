package yatzaqziq.lecturefour;

public class Main {
    public static void main(String[] args) {
        // object

        // Arrays with object references
        Book book1 = new Book();
        Book book2 = new Book();

        Book[] booksArray = {book1, book2};

        booksArray[0].title = "Fundamentals of DB";
        booksArray[1].title = "Al-Ayam";
        for (Book book : booksArray) {
            System.out.println(book.title);
        }



//        book1.title = "Al Ayam";
//
//        book2.title = "Fundamentals of DB";
//
//        // When references are equal
//        book1 = book2;
//
//        System.out.println(book1.title);
//        System.out.println(book2.title);
////
//        book1.title = "XYZ";
//        System.out.println(book2.title);



//        book1.title = "Fundamentals of Database Systems";
//        book1.author = "Elmasri Navath";
//        book1.pages = 1000;
//        book2.title = "Clean Code Architecture";
//        book2.author = "Daniel Murphy";
//        book2.pages = 2000;
//
//        System.out.println("Book 1:\n---------\nBook Name: " + book1.title + "\nAuthor: " + book1.author + "\nPages: " + book1.pages + "\n---------\n");
//        System.out.println("\n\nBook 2:\n---------\nBook Name: " + book2.title + "\nAuthor: " + book2.author + "\nPages: " + book2.pages + "\n---------\n");


//        book1.saveBook("Fundamentals of Database Systems","Elmasri Navath", 1000);
//
//        book2.saveBook("Clean Code Architecture", "Daniel Murphy", 2000);
//
//
//        book1.showBook();
//
//        book2.showBook();





    }
}
