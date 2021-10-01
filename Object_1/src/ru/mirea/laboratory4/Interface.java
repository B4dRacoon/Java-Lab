package ru.mirea.laboratory4;

public class Interface {
    public static void main(String[] args) {
        Priceable p = new Voucher("Путевка в Мексику", 55400);
        System.out.println(p);
        System.out.println(p.getPrice());
        p = new Laptop(12000, "Какая-то модель");
        System.out.println(p);
        p = new Printer(800, 1800, "Черный");
        System.out.println(p);
    }

}
