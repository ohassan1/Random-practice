package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputHours,
                inputMinutes;


        Clock DaTime = new Clock();

        System.out.print("Hours?: ");
        inputHours = sc.nextLine();
        int Hours = Integer.parseInt(inputHours);

        System.out.print("Minutes?: ");
        inputMinutes = sc.nextLine();
        int Minutes = Integer.parseInt(inputMinutes);

        DaTime.setTime(Hours, Minutes);

        DaTime.whatTimeIsIt();
    }
}
