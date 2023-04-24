package MainClass;

//Import packages
import abstractClass.*;
import RegularClasses.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {

        ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
        vehicleList.add(new Jeep("Range Rover", 200, 30, 10));
        vehicleList.add(new Frigate("c'est marseille bb", 100, 13));
        vehicleList.add(new SpyPlane("Cannabis"));


        int userChoice;
        while (true){
            PrintMenu();
            userChoice =  Choice();
            switch (userChoice){
                case 1:
                    int countnum =1;
                    for (Vehicle i: vehicleList) {
                        System.out.println(countnum + " -------> " + i.toString());
                        countnum++;
                    }



                    break;
                case 2: {
                    int choice;
                    Scanner input = new Scanner(System.in);
                    countnum = 1;
                    do {
                        for (Vehicle i : vehicleList) {
                            System.out.println(countnum + " -------> " + i.toString());
                            countnum++;
                        }
                        choice = input.nextInt();
                    } while(choice > countnum && choice<0);

                }



                    break;
                case 3: {
                    for (Vehicle i : vehicleList) {
                        i.setTotalDistance(0);
                    }
                }

                    break;
                case 4: {
                    for (Vehicle i : vehicleList) {
                        if (i instanceof MarineVehicle) {
                            ((MarineVehicle) i).setFlag("no Flag");
                            System.out.println(i.toString());
                        }
                    }
                }
                    break;
                default: {
                    System.out.println("Bye LE SANG ");
                    exit(0);
                }
            }





        }

    }

    public static int Choice(){
        int choice;
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();
        while(choice <=0 || choice >5) {
            System.out.println("Your choice is Incorrect. Choice another VALID number");
            choice = input.nextInt();
        }
        return choice;

    }

    public static void PrintMenu(){
        System.out.println("-----------------------------MENU -----------------------------");
        System.out.println("1- Buy a Car");
        System.out.println("2- Take Car for Test");
        System.out.println("3- Initialization distance for all vehicle.");
        System.out.println("4- Change flag.");
        System.out.print("5- Exit the system ");
    }


}
