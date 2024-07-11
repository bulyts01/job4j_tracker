package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Создайте анонимный класс на основе интерфейса Comparator для модели Attachment.
// Класс должен сравнивать имена объектов Attachment.

public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 100),
                new Attachment("image 2", 34),
                new Attachment("image 3", 13),
                new Attachment("image 0", 13),
                new Attachment("images 0", 13)
        );
        Comparator<Attachment> comparator = Comparator.comparingInt(Attachment::getSize);
        attachments.sort(comparator);
        System.out.println(attachments);
        // Здесь создайте компаратор на основании анонимного класса.

        Comparator<Attachment> comparatorByName = Comparator.comparing(Attachment::getName);
        attachments.sort(comparatorByName);
        System.out.println(attachments);
    }
}

class Attachment {
    private String name;
    private int size;
    public Attachment(String image, int size) {
        this.name = image;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Attachment{" +
                "image='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}