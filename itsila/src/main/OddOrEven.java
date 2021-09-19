package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OddOrEven {
    public static void main(String[] args) {
        int number = 0;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            number = Integer.parseInt(reader.readLine());
            reader.close();
        }catch (Exception e){
            System.out.println("Что-то пошло не так.");
        }

        if (number%2 == 0) System.out.println("Введенное число четное");
        else System.out.println("Введенное число нечетное");


    }
}
