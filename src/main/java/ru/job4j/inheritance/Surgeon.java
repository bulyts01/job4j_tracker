package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private String bone;

    public Surgeon(String name, String surname, String education, String birthday, int district, String bone) {
        super(name, surname, education, birthday, district);
        this.bone = bone;
    }

    public String getBone() {
        return this.bone;
    }
}
