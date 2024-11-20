package ictgharbia.lectureeight.lecture.listeners.animal.listener;

public interface DogI {
    default void defineDog(){
        System.out.println("Default: Define Dog");
    }
    void parking();
}
