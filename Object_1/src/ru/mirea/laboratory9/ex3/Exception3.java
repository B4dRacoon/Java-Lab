package ru.mirea.laboratory9.ex3;

import java.util.Scanner;

public class Exception3 {
    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (NumberFormatException e){             // Compile error: NumberFormatException already catched
            System.out.println("Not correct number");
        }
        catch(Exception e) {
            System.out.println("Exception happened!");
        }
    }

    public static void main(String[] args) {
        Exception3 e2 = new Exception3();
        e2.exceptionDemo();
    }
}