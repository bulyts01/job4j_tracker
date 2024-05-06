package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private int numLines;

    public Programmer(String name, String surname, String education, String birthday, String project, int numLines) {
        super(name, surname, education, birthday, project);
        this.numLines = numLines;
    }

    public int getNumLines() {
        return this.numLines;
    }
}
