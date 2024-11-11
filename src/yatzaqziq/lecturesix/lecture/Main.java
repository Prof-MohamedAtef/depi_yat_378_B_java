package yatzaqziq.lecturesix.lecture;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Tahah Hussein", "Al Ayam", "Dar Misr");
        book.setTitle("Al Ayam");
        book.setAuthorName("Taha Hussein");
        book.setPublisher("Dar Misr");

        System.out.println(book.getTitle() + " " + book.getAuthorName() + " " + book.getPublisher());

        Item item = new Item("Cheese", 150, 3, "30-11-2024", "Dommti");

        System.out.println(item.printData());

        Item item1 = new Item("Bescuets", 250, 5, "30-11-2024", "Besco Misr");
        System.out.println(item1.printData());
    }
}
