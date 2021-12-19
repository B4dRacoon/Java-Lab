package ru.mirea.practice12;

public class Person {
    private String surname, name, patronymic;

    public Person(String surname) {
        this.surname = surname;
    }

    public Person(String surname,String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }
    public String getFio(){
        StringBuilder sb = new StringBuilder(surname);
        if(name != null && ! name.equals(""))
            sb.append(" ").append(name);
        if(patronymic != null && ! patronymic.equals(""))
            sb.append(" ").append(patronymic);
        return sb.toString();
    }

    public static void main(String[] args) {
        Person p1 = new Person("Балашов");
        Person p2 = new Person("Балашов", "", "");
        Person p3 = new Person("Балашов", "Даниил", "Александрович");

        System.out.println(p1.getFio());
        System.out.println(p2.getFio());
        System.out.println(p3.getFio());
    }
}
