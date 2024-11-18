package yatzaqziq.lectureeight.lecture.listener.machine.closing.sheets;

public interface ClosableSheetsI {
    public void closeSheets();
    default void saveSheet(){
        System.out.println("Saving sheet");
    }

    default void getUserResponse(boolean f){
        System.out.println("User response: " + f);
    }
}
