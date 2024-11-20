package ictgharbia.lectureeight.lecture.listeners.animal.listener;

public interface AnimalI {

    default void defineLionSpeed(){
        System.out.println("Lion Speed = 300 KM/hr");
    }

    public void defineLion();

}