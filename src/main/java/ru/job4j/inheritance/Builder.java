package ru.job4j.inheritance;

public class Builder extends Engineer {

    private String material;

    public Builder(String name, String surname, String education, String birthday, String project, String material) {
        super(name, surname, education, birthday, project);
        this.material = material;
    }

    public String getMaterial() {
        return this.material;
    }
}
