package com.company;
import java.io.IOException;
import java.util.Scanner;
import Task1.task1;
import static java.lang.Integer.parseInt;

public class Main {
    static Scanner myObj = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        var cruiseShipCabin = new String[12];

        while (true){

            task1 mtask = new task1();
            System.out.println("");
            System.out.println("<<<--- MENU --->>>");
            System.out.println("");
            System.out.println("A :     add a customer to a cabin");
            System.out.println("V :     view all cabins");
            System.out.println("E :     Display Empty cabins");
            System.out.println("D :     Delete customer from cabin");
            System.out.println("F :     Find cabin from customer name ");
            System.out.println("S :     Store program data into file");
            System.out.println("L :     Load program data from file");
            System.out.println("O :     View passengersOrdered alphabetically by name.");
            System.out.println("");
            System.out.println("");
            System.out.print("Choose What You Want To Do? ");

            var choosedLetter = myObj.nextLine();
            String value = choosedLetter.toUpperCase();
            if (value.equals("A")) {
                try {
                    mtask.addCabin(cruiseShipCabin);
                }
                catch(Exception e) {
                    System.out.println("You can only select a number between 1 - 12.");
                }
            } else if (value.equals("V")) {
                mtask.viewCabin(cruiseShipCabin);
            } else if (value.equals("E")) {
                mtask.viewEmptyCabin(cruiseShipCabin);
            }else if (value.equals("F")){
                mtask.findCabin(cruiseShipCabin);
            }else if (value.equals("O")){
                mtask.sortCabin(cruiseShipCabin);
            }else if (value.equals("S")){
                mtask.writeFile(cruiseShipCabin);
            }else if (value.equals("L")){
                mtask.readFile(cruiseShipCabin);
            }else if (value.equals("D")){
                try {
                    mtask.removeCabin(cruiseShipCabin);
                }
                catch(Exception e) {
                    System.out.println("No cabins are reserved here");
                }
            } else {
                System.out.println("");
                System.out.println("<===There is no menu corresponding to the charactor entered you===>");
                System.out.println("");
            }

        }
    }
}
