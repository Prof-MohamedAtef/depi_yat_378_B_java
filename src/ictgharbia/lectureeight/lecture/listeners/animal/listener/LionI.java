package ictgharbia.lectureeight.lecture.listeners.animal.listener;

public interface LionI {

    int lionLegs = 0;


    // 1. define un-implemented method in interface
    // 2. set un-implemented method without abstract keyword
    // 3. methods in abstract by default abstract members
    public void defineLion();

    // Java 8
    default void defineLionSpeed(){

    }

}
