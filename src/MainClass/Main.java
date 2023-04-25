package MainClass;

//Import packages

import RegularClasses.Frigate;
import RegularClasses.GamePlane;
import RegularClasses.Jeep;
import RegularClasses.SpyPlane;
import abstractClass.MarineVehicle;
import abstractClass.Vehicle;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;


public class Main {

    static String redBold = "\033[1;31m"; // for display red Bold text
    static String reset = "\033[0m";//reset color of the text
    static String blueBold = "\033[1;34m";// for display bleu Bold text


    public static void main(String[] args) {

        int userChoice = 0, dataInt;
        String dataString;
        double dataDouble, dataDouble2, dataDouble3;
        boolean check = true;
        Scanner input = new Scanner(System.in);
        ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();


        while(check) {
            do {
                System.out.println("which type of vehicle you want to add ?");
                System.out.println("1. GamePlane\n2. SpyPlane\n3.Frigate\n4. Jeep\n5.No more vehicle to add");
                userChoice = input.nextInt();
            } while (userChoice < 1 || userChoice > 5);
            switch (userChoice) {
                case 1 -> {
                    vehicleList.add(new GamePlane());
                    break;
                }
                case 2 -> {
                    System.out.println("Enter source of Energy for your Spy plane.");
                    dataString = input.next();
                    vehicleList.add(new SpyPlane(dataString));

                    break;
                }
                case 3 -> {
                    System.out.println("Enter model name for your Frigate");
                    dataString = input.next();
                    System.out.println("Enter number of passenger for your Frigate.");
                    dataInt = input.nextInt();
                    System.out.println("Enter maximum speed for your Frigate");
                    dataDouble = input.nextDouble();
                    vehicleList.add(new Frigate(dataString, dataInt, dataDouble));
                    break;
                }
                case 4 -> {
                    System.out.println("Enter model name for your Jeep");
                    dataString = input.next();
                    System.out.println("Enter maximum speed for your Jeep");
                    dataDouble = input.nextDouble();
                    System.out.println("Enter Average Fuel consumption of your Jeep");
                    dataDouble2 = input.nextDouble();
                    System.out.println("Enter Life time Engine of your Jeep");
                    dataDouble3 = input.nextDouble();
                    vehicleList.add(new Jeep(dataString, dataDouble, dataDouble2, dataDouble3));

                    break;
                }
                default -> {
                    check = false;
                    break;
                }
            }
        }





        //Built All Vehicles of the Car agency

//        vehicleList.add(new Jeep("Range Rover", 200, 30, 10));
//        vehicleList.add(new Frigate("c'est marseille bb", 100, 13));
//        vehicleList.add(new SpyPlane("Cannabis"));

        while (true){
            PrintMenu();
            userChoice =  Choice();
            switch (userChoice) {
                case 1 -> { //buy Car
                    System.out.println("\n\n");
                    PrintAllVehicle(vehicleList); //print all vehicles of CarAgency
                    System.out.println("\n\n\n\n\n");


                }
                case 2 -> {
                    int choice, countnum;
                    Scanner input1 = new Scanner(System.in);
                    do {
                        countnum = PrintAllVehicle(vehicleList);
                        choice = input1.nextInt();
                    } while (choice > countnum && choice < 0);

                }

                case 3 -> {
                    for (Vehicle i : vehicleList) {
                        i.setTotalDistance(0);
                    }
                }
                case 4 -> {
                    Scanner input1 = new Scanner(System.in);
                    System.out.println("Enter new name of the flag");
                    String newFlag = input1.nextLine();
                    for (Vehicle i : vehicleList) {
                        if (i instanceof MarineVehicle) {
                            ((MarineVehicle) i).setFlag(newFlag);
                            System.out.println(i.toString());
                        }
                    }
                }
                default -> {
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

    } //input from the user for the menu

    public static void PrintMenu(){
        System.out.println("-----------------------------MENU -----------------------------");
        System.out.println(blueBold + "1 -" + reset + "Buy a Car");
        System.out.println(blueBold + "2-" + reset + "Take Car for Test");
        System.out.println(blueBold + "3-" + reset + "Initialization distance for all vehicle.");
        System.out.println(blueBold + "4-" + reset + "Change flag.");
        System.out.println(blueBold+ "5-" + reset + "Exit the system\n ");
    } //print all choice for the menu

    public static int PrintAllVehicle(ArrayList<Vehicle> vehicleList){
        int countnum =1;
        for (Object i: vehicleList) {
            System.out.println(redBold + countnum +  " -------> " + reset + i.toString());
            countnum++;
        }
        return countnum;
    } //print list of all vehicle

    public static void CarAgency(){}

}
