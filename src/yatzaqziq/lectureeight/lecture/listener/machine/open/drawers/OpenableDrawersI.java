package yatzaqziq.lectureeight.lecture.listener.machine.open.drawers;

public interface OpenableDrawersI {
    void openAThreeDrawer();
    default void openAFourDrawer(){
        System.out.println("openAFourDrawer");
    }

    static void openBFiveDrawer(){
        System.out.println("openBFiveDrawer");
    }

    final static int x = 5;
}
