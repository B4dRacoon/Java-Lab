package ru.mirea.practice5;

public class Recursion {

    private static void number3 (int A, int B){
        if (A < B){
            while (A <= B){
                System.out.println(A);
                A++;
            }
        }
        else if (A > B) {
            while (A >= B) {
                System.out.println(A);
                A--;
            }
        }
    }

    private static int number9 (int a, int b){
        if (a == 0) return 1;
        if (a == 1) return b+1;
        if ((a > 1)&&(b == 0)) return 0;
        return number9(a-1, b-1) + number9(a, b-1);
    }

    private static int number10 (int num, int rev){
        if (num == 0) return rev;
        return number10(num/10, 10+rev + num%10);
    }

    public static void main(String[] args) {
        System.out.println("Number 3: ");
        number3(10, 20);
        System.out.println(" ");

        System.out.println("Number 9: ");
        System.out.println(number9(0, 0));
        System.out.println(number9(1, 3));
        System.out.println(number9(14, 15));
        System.out.println(" ");

        System.out.println("Number 10: ");
        System.out.println(number10(123, 0));
        System.out.println(number10(1, 0));
        System.out.println(number10(7755649, 0));
    }
}
