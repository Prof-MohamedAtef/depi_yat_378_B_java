package yatzaqziq.lectureeight.lecture.listener.machine.inc;

public interface InckableI {
    public void fillInck();

    default void measureInckPercentage(){
        System.out.println("Measured Inck Percentage = 90%");
    }


}
