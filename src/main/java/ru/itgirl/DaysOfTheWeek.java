package ru.itgirl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

public class DaysOfTheWeek {
    public static void daysOfTheWeek() {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner sc = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput) {
            System.out.println("Enter day of the week in English: ");
            String day = sc.nextLine();
            switch (day) {
                case "Monday":
                    System.out.println("Понедельник");
                    validInput = true;
                    break;
                case "Tuesday":
                    System.out.println("Вторник");
                    validInput = true;
                    break;
                case "Wednesday":
                    System.out.println("Среда");
                    validInput = true;
                    break;
                case "Thursday":
                    System.out.println("Четверг");
                    validInput = true;
                    break;
                case "Friday":
                    System.out.println("Пятница");
                    validInput = true;
                    break;
                case "Saturday":
                    System.out.println("Суббота");
                    validInput = true;
                    break;
                case "Sunday":
                    System.out.println("Воскресенье");
                    validInput = true;
                    break;
                default:
                    System.out.println("Error, please try again\n");
            }
        }
    }
}


