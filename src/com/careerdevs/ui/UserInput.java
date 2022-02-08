package com.careerdevs.ui;

import com.careerdevs.Car;
import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    //why make this scanner static
    private static Scanner scan = new Scanner(System.in);

//stack local variables stored on cpu via cache
    //heap reference type data in ram and class varibles
    public static int readInt(String question, int min, int max) {
         int userInt;

        while (true) {
            System.out.println(question);
            try {
                userInt = scan.nextInt();
                if (userInt >= min && userInt <= max) {
                    System.out.println(userInt);
                    return userInt;
                }
                System.out.println("Selection must be between" + " " +  min + " and" +" " + max);
            }catch (InputMismatchException e) {
                System.out.println("An error has happened");
                System.out.println("Selection must be a whole number");
                scan.nextLine();
                //return readInt(question, min, max);
            }
        }
    }

        }






