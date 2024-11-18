package yatzaqziq.lectureeight.lecture.listener.machine;

public interface ScannerListener {
    public void scanPaper();

    public void scanPdf();
    public void scanPng();
    public void scanGif();
    public void scanJpeg();
    public void scanJpg();
    public void scanPsd();


    public void move();
    public void closeAThreeDrawer();
    public void checkDrawerIsOpen();
    public void checkDrawerHasPapers();
}