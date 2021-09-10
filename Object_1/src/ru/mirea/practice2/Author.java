package ru.mirea.practice2;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author (String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public Author (String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

    public String GetName(String name){
        return name;
    }

    public void SetEmail(String email){
        this.email = email;
    }

    public String GetEmail(){
        return email;
    }

    public char GetGender(char gender){
        return gender;
    }

    public String toString(){
        String SGender = Character.toString(gender);
        return "Author's name: " + name + "\nAuthor's email: " + email + "\nAuthor's gender: " + SGender;
    }
}
