package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private int tooth;

    public Dentist(String name, String surname, String education, String birthday, int district, int tooth) {
        super(name, surname, education, birthday, district);
        this.tooth = tooth;
    }

    public int getTooth() {
        return this.tooth;
    }
}
