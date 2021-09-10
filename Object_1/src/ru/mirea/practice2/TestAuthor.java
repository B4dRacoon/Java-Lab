package ru.mirea.practice2;

public class TestAuthor {
    public static void main(String[] args) {
        Author andy = new Author("Andrew", "andre@mail.ru",'M');
        Author jo = new Author("Jorge", 'M');
        jo.SetEmail("jorge@mail.ru");
        String joEmail = jo.GetEmail();
        System.out.println("Jorge's email: " + joEmail);
        String andyName = andy.GetName("Andrew");
        System.out.println("Author's name: " + andyName);
        System.out.println("\n");
        System.out.println(andy);
        System.out.println("\n");
        System.out.println(jo);
    }
}
