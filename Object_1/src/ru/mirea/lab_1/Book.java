package ru.mirea.lab_1;

public class Book {
    private String name;
    private int releasdate;

    public Book (String n, int r){
        name = n;
        releasdate = r;
    }

    public String toString(){
        String date = Integer.toString(releasdate);
        return "Name of Book: " + name + "\n Releas date : " + date;
    }
}
