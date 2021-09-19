package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DayOfWeek {
    public static void main(String[] args) {
        int day = 0;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            day = Integer.parseInt(reader.readLine());
            reader.close();
        }catch (Exception e){
            System.out.println("Что-то пошло не так.");
        }
        switch (day){
            case 1:
                System.out.println("Понедельник");
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Неправильный ввод");
        }
    }
}
