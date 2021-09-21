package main;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        int day = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            day = scanner.nextInt();
           scanner.close();
        }catch (Exception e){
            System.out.println("Что-то пошло не так.");
        }
        switch (day){
            case 1:
                System.out.println("Понедельник");
                break;
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
