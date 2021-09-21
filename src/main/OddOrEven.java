package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        int number = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
            scanner.close();
        }catch (Exception e){
            System.out.println("Что-то пошло не так.");
        }

        if (number%2 == 0) System.out.println("Введенное число четное");
        else System.out.println("Введенное число нечетное");


    }
}
