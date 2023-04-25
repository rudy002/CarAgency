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


        while(check) { //Enter all vehicles
            do {
                PrintTypeVehicle();
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

                    vehicleList.add(new Frigate(dataString,dataInt, dataDouble));
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
                case 1 -> { //BUY CAR
                    PrintSpecificTypeFromListOrAll(vehicleList, 5);
                    System.out.println("\n\n");
                    PrintTypeVehicle();
                    userChoice = Choice();
                    switch (userChoice) {
                        case 1 -> {
                            System.out.println("You want buy GamePlane type :");
                            PrintSpecificTypeFromListOrAll(vehicleList, userChoice);
                            Vehicle temp = new GamePlane();
                            int index = WhichIndex(vehicleList, temp);
                            if(index != -1) {
                                vehicleList.remove(index);
                                System.out.println("Congratulation !! You buy new Game Plane.");
                            }
                            else
                                System.out.println("Error ! you don't find anything like that in our Car Agency");
                            break;
                        }
                        case 2 -> {
                                System.out.println("You want buy SpyPlane type :");
                                System.out.println("Enter source of Energy for your Spy plane.");
                                dataString = input.next();
                                Vehicle temp = new SpyPlane(dataString);
                                int index = WhichIndex(vehicleList, temp);
                                if(index != -1) {
                                    vehicleList.remove(index);
                                    System.out.println("Congratulation !! You buy new Spy Plane.");
                                }
                                else
                                    System.out.println("Error ! you don't find anything like that in our Car Agency");
                                break;
                            }
                        case 3 -> {
                                System.out.println("You want buy Frigate type :");
                                System.out.println("Enter model name for your Frigate");
                                dataString = input.next();
                                System.out.println("Enter number of passenger for your Frigate.");
                                dataInt = input.nextInt();
                                System.out.println("Enter maximum speed for your Frigate");
                                dataDouble = input.nextDouble();

                                Vehicle temp = new Frigate(dataString, dataInt, dataDouble);
                                int index = WhichIndex(vehicleList, temp);
                                if(index != -1) {
                                    vehicleList.remove(index);
                                    System.out.println("Congratulation !! You buy new Frigate.");
                                }
                                else
                                    System.out.println("Error ! you don't find anything like that in our Car Agency");
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

                                Vehicle temp = new Jeep(dataString, dataDouble, dataDouble2, dataDouble3);
                                int index = WhichIndex(vehicleList, temp);
                                if(index != -1) {
                                    vehicleList.remove(index);
                                    System.out.println("Congratulation !! You buy new Jeep.");
                                }
                                else
                                    System.out.println("Error ! you don't find anything like that in our Car Agency");
                                break;
                        }
                        default -> {
                                System.out.println("You buy anything.");
                                break;
                        }
                    }

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

    public static void PrintTypeVehicle(){
        System.out.println("which type of vehicle you want ?");
        System.out.println("1 - GamePlane\n2 - SpyPlane\n3 - Frigate\n4 - Jeep\n5 - Nothing Else.");
    }

    public static int WhichIndex(ArrayList<Vehicle> vehicleList, Vehicle vehicle){
        int countnum =1;
        for (Object i: vehicleList) {
            if(vehicle.equals(i)){
                return countnum-1;
            }
            countnum++;
        }
        return -1;
    }

    public static void PrintSpecificTypeFromListOrAll(ArrayList<Vehicle> vehicleList, int type){
        int j=1;
        switch (type){
            case 1 ->
            {//print all object of type GamePlane
                System.out.println(redBold+"PRINT ALL GAME PLANE VEHICLES"+ reset);
                for (Vehicle i: vehicleList){
                    if (i.getClass() == GamePlane.class){
                        System.out.println(j +" --->"+i.toString());
                        j++;
                    }
                    else j++;
                }
            }
            case 2 ->
            {//print all object of type SpyPlane
                System.out.println(redBold+"PRINT ALL SPY PLANE VEHICLES"+ reset);
                for (Vehicle i: vehicleList){
                    if (i.getClass() == SpyPlane.class){
                        System.out.println(j +" --->"+i.toString());
                        j++;
                    }
                    else j++;
                }
            }
            case 3 ->
            {//print all object of type Frigate
                System.out.println(redBold+"PRINT ALL FRIGATE VEHICLES"+ reset);
                for (Vehicle i: vehicleList){
                    if (i.getClass() == Frigate.class){
                        System.out.println(j +" --->"+i.toString());
                        j++;
                    }
                    else j++;
                }
            }
            case 4 ->
            {//print all object of type Jeep
                System.out.println(redBold+"PRINT ALL JEEP VEHICLES"+ reset);
                for (Vehicle i: vehicleList){
                    if (i.getClass() == Jeep.class){
                        System.out.println(j +" --->"+i.toString());
                        j++;
                    }
                    else j++;
                }
            }
            default ->
            {//print all Vehicles
                System.out.println(redBold+"PRINT ALL VEHICLES"+ reset);
                for (Object i: vehicleList) {
                    System.out.println(redBold + j +  " -------> " + reset + i.toString());
                    j++;
                }
            }
        }

    }


}
