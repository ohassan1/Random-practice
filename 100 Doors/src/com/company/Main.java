package com.company;

public class Main {

    public static void main(String[] args) {

        int numOfDoors = 100;
        int doorNumArray[] = new int[100];
        boolean doors[] = new boolean[numOfDoors];

        // set each door to false which will mean closed
        for (int i = 0; i < numOfDoors; i++) {
            doors[i] = false;
        }

        // initialize door number arrays values
        for (int i = 1; i <= numOfDoors; i++) {
            doorNumArray[i-1] = i;
        }

        for (int i = 1; i <= numOfDoors; i++) {
            for (int j = 1; j <= numOfDoors; j++) {
                if (doorNumArray[j-1] % i == 0) {
                    if (doors[j-1] == true){
                        doors[j-1] = false;
                    } else {
                        doors[j-1] = true;
                    }
                }
            }
        }

        for (int i = 1; i <= numOfDoors; i++) {
            System.out.print("Door number " + i + " is ");
            if (doors[i-1] == true) {
                System.out.println("Open.");
            } else {
                System.out.println("Closed.");
            }
        }
    }
}
