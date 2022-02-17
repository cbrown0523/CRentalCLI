package com.careerdevs;

import com.careerdevs.ui.UserInput;

import java.util.ArrayList;
// a statc class
// what is a  utility class?
//types of classes categpries


public class RentalService {
    private static ArrayList<Car> availableCars = new ArrayList<>();
    private static ArrayList<Car> rentedCars = new ArrayList<>();

    public static void initCarStorage(){
        Car rental1 = new Car("Honda", "Accord" , false);
        Car rental2 = new Car("Mercedes", "Benz" , false);
        Car rental3 = new Car("Bentley", "Arnage" , true);
        availableCars.add(rental1);
        availableCars.add(rental2);
        rentedCars.add(rental3);

    }
    private static void mainMenu() {
        System.out.println("Welcome to Java Car Rentals!");
        System.out.println("Would you like to...");
        System.out.println("1)" + "Rent");
        System.out.println("2)" + "Return");
        System.out.println("3)" + "Exit the Program");
        //UserInput user1 = new UserInput();

        int userNumSelection = UserInput.readInt("Make a selection" , 1, 3);
        switch(userNumSelection){
        //switch(UserInput.readInt("Make a selection" , 1, 3)){
            case 1 : rentalMenu();
            break;
            case 2: returnMenu();
            break;
            case 3 :
                System.exit(0);
            break;
            default:
                System.out.println("Enter a whole number");
        }

      /*if (UserInput.readInt("Rentbgrdtwr2", 1, 3) == 1 ){
            rentalMenu();
        } else if (UserInput.readInt("Return", 1, 3) == 2 ){
            returnMenu();
        }
      else if (UserInput.readInt("Exit the Program", 1, 3) == 3 ){
        returnMenu();
       }
        else
            System.out.println("Goody Bye");

*/
    }

    private static void returnMenu(){
        if (rentedCars.isEmpty()) {
            System.out.println("There are no more cars to return");

        }else {
            System.out.println("Rented Cars");
            for (int i = 0; i < rentedCars.size(); i++) {
                System.out.println("(" + (i + 1) + ") " + rentedCars.get(i).getName());
            }
            int readUserInput = UserInput.readInt("Enter a number to select the car you'd like to return" + "\n" + "Selection", 1, rentedCars.size());

            Car carSelection = rentedCars.get(readUserInput - 1);

            System.out.println(readUserInput);
            System.out.println("Thank you! You have returned the" + " " + rentedCars.get(readUserInput - 1).getName());

            carSelection.setRented(false);


            availableCars.add(carSelection);
            rentedCars.remove(readUserInput - 1);
            System.out.println(availableCars);
            System.out.println(rentedCars);
            System.out.println(carSelection);

            for (int i = 0; i < rentedCars.size(); i++) {
                System.out.println("(" + (i + 1) + ") rented cars " + rentedCars.get(i).getName());
            }
            ;
            for (int i = 0; i < availableCars.size(); i++) {
                System.out.println("(" + (i + 1) + ") available cars " + availableCars.get(i).getName());
            }
        }
        mainMenu();
    };
    private static void rentalMenu() {
        if (availableCars.isEmpty()) {
            System.out.println("There are no more cars to rent");
        }else{
            System.out.println("Available Cars");
            //initCarStorage();
            for (int i = 0; i < availableCars.size(); i++) {
                System.out.println("(" + (i + 1) + ") " + availableCars.get(i).getName());
            }
            int readUserInput = UserInput.readInt("Enter a number to select the car you'd like to rent" + "\n" + "Selection", 1, availableCars.size());
            //ArrayList<Car> carSelection = new ArrayList<>();
            Car carSelection = availableCars.get(readUserInput - 1);
            System.out.println("Thank you! You are now renting the" + " " + availableCars.get(readUserInput - 1).getName());


            //rentedCars.add(availableCars.get(readUserInput - 1));
            //System.out.println(rentedCars);
            carSelection.setRented(true);
            availableCars.remove(readUserInput - 1);
            rentedCars.add(carSelection);

            System.out.println(availableCars);
            System.out.println(rentedCars);
            System.out.println(carSelection);
            for (int i = 0; i < rentedCars.size(); i++) {
                System.out.println("(" + (i + 1) + ") rented cars " + rentedCars.get(i).getName());
            }
            ;
            for (int i = 0; i < availableCars.size(); i++) {
                System.out.println("(" + (i + 1) + ") available cars " + availableCars.get(i).getName());
            }

        }

        mainMenu();
    }


    public static void main(String[] args) {
        //System.out.println("Welcome to the Car Rental CLI");
        //UserInput.readInt("make a selection", 1 , 3);
        //rentalMenu();
        initCarStorage();
        mainMenu();
        //rentalMenu();
        //UserInput.readInt("dfa",3,4);

        //System.out.println(RentalService.availableCars);

        //  why am i creating instances of objects i cant picture it


        //System.out.println(rental1.setRented());


        /* String carStatus;

        int listNumber = 0;
        for(int i = 0; i < carStorage.length; i++){

            // why can i use .equals(thought was a object)
            if(!carStorage[i].isRented()) {
                carStatus = "Available";
            }else{
                    carStatus = "Not Available";
                    }

                listNumber +=1;
                System.out.println("(" + listNumber  + ") " + "(" + carStatus + ")" + " "+ carStorage[i].getMake() + " " + carStorage[i].getModel());
        }

*/


    }
}



