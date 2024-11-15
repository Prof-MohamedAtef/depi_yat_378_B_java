package yatzaqziq.lectureseven.lecture.books;


// Inheritance
public class Story extends Book {

    public void printStory(){
        System.out.println("Story: " + this.title);
    }

    public void calculatePrice(int pages, int pagePrice){
        System.out.println("Story Price: " + pagePrice * pages);
    }


    public void calculatePrice(int pages, int pagePrice, double discount){

    }
}
