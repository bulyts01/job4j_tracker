package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book history = new Book("Ancient Rome", 450);
        Book russian = new Book("Russian language", 230);
        Book detective = new Book("Agatha Christie", 310);
        Book fantasy = new Book("Space", 120);
        Book[] books = new Book[4];
        books[0] = history;
        books[1] = russian;
        books[2] = detective;
        books[3] = fantasy;
        books[1].setName("Clean code");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " " + books[i].getPages());
        }
        String overName = books[0].getName();
        int overPages = books[0].getPages();
        books[0].setName(books[3].getName());
        books[0].setPages(books[3].getPages());
        books[3].setName(overName);
        books[3].setPages(overPages);
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " " + books[i].getPages());
        }
        for (int i = 0; i < books.length; i++) {
            if ("Clean code".equals(books[i].getName())) {
                System.out.println(books[i].getName() + " " + books[i].getPages());
            }
        }

    }
}
