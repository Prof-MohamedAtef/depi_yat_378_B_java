package ictgharbia.lectureeight.lecture.listeners.animal.listener;

public interface CatI {
    public void defineCat();

    default int measureSpeed(){
        return 15;
    }
}
