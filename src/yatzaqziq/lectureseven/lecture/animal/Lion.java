package yatzaqziq.lectureseven.lecture.animal;

public class Lion extends Animal{

    String specificTitle;

    public Lion(int legs, int eyes, String color, String title, String specificTitle) {
        super(legs, eyes, color, title);
        this.specificTitle = specificTitle;
    }

    public void eat(){
        System.out.println("Lion eats");
    }

//    public void printAnimal() {
//        System.out.println(specificTitle);
//    }
}
