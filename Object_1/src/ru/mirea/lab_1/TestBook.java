package ru.mirea.lab_1;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book ("The Call of Cthulhu", 1926 );
        Book b2 = new Book ("Мёртвые души, Том 1", 1990);
        Book b3 = new Book ("Moby Dick or White Whale", 1851);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
