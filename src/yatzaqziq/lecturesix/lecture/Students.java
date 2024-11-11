package yatzaqziq.lecturesix.lecture;

public class Students {
    private int age;
    private String name;
    private boolean isGraduated;
    private boolean isMarried;
    private boolean hasSon;
    private int sons;

    public Students(int age, String name, boolean isGraduated, boolean isMarried, boolean hasSon, int sons) {
        this.age = age;
        this.name = name;
        this.isGraduated = isGraduated;
        this.isMarried = isMarried;
        this.hasSon = hasSon;
        this.sons = sons;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGraduated() {
        return isGraduated;
    }

    public void setGraduated(boolean graduated) {
        isGraduated = graduated;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public boolean isHasSon() {
        return hasSon;
    }

    public void setHasSon(boolean hasSon) {
        this.hasSon = hasSon;
    }

    public int getSons() {
        return sons;
    }

    public void setSons(int sons) {
        this.sons = sons;
    }
}
