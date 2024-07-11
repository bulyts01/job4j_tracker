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
        Comparator<Attachment> comparator = new Comparator<>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                return Integer.compare(o1.getSize(), o2.getSize());
            }
        };
        attachments.sort(comparator);
        System.out.println(attachments);
        // Здесь создайте компаратор на основании анонимного класса.

        Comparator<Attachment> comparatorByName = new Comparator<>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                return o1.getName().compareTo(o2.getName());
//                return Integer.compare(o1.getName().length(),o2.getName().length());
            }
        };
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

    @Override
    public String toString() {
        return "Attachment{" +
                "image='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}