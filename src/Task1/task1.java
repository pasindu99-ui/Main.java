package Task1;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Integer.parseInt;
import java.io.*;

public class task1 {
    static Scanner myObj = new Scanner(System.in);


    public task1() throws IOException {
    }


    public String[] addCabin(String[] cruiseShipCabin) {
        System.out.println("");
        System.out.print("Enter Cabin number : ");
        int CabinNumber = parseInt(myObj.nextLine());
        System.out.print("Enter name : ");
        String firstname = myObj.nextLine();
        cruiseShipCabin[CabinNumber - 1] = String.valueOf(firstname);
        return cruiseShipCabin;

    }

    public static void viewCabin(String[] cruiseShipCabin) {
        System.out.println("");
        System.out.println("<<<--- VIEW CABINS --->>>");
        System.out.println("");
        for (int i = 0; i < cruiseShipCabin.length; i++) {
            if (cruiseShipCabin[i]==null) {
                System.out.println(" cabin "+ (i+1)+" is empty");

            }else{
                System.out.println(" cabin "+ (i+1)+" is full");
            }
        }
    }

    public static void viewEmptyCabin(String[] cruiseShipCabin) {
        System.out.println("");
        System.out.println("<<<--- VIEW EMPTY CABINS --->>>");
        System.out.println("");
        for (int i = 0; i < cruiseShipCabin.length; i++) {
            if (cruiseShipCabin[i]==null) {
                System.out.println(" cabin "+ (i+1)+" is empty");
            }
        }
    }
    public static void findCabin(String[] cruiseShipCabin) {
        System.out.print("Enter first name : ");
        String findCabin = (myObj.nextLine()).toString();
        for(int i=0; i< cruiseShipCabin.length; i++){
                String loopedCabin = cruiseShipCabin[i];
                if (loopedCabin != null) {
                    if (loopedCabin.equals(findCabin)) {
                        System.out.println(findCabin+" Is in the Cabin number => "+(i+1));
                    }
                }
        }
    }

    public static void sortCabin(String[] cruiseShipCabin) {
        System.out.println("");
        System.out.println("<<<--- ALPHABETICALLY ORDERED --->>> ");
        System.out.println("");
        String [] names = {};
        for(int i=0; i< cruiseShipCabin.length; i++) {
            String fName = cruiseShipCabin[i];
            if (fName != null) {
                names = Arrays.copyOf(names, names.length + 1);
                names[names.length - 1] = String.valueOf(fName);
            }
        }

            Arrays.sort(names); //Sort the array in alphabetical order
            for (int j = 0; j < names.length; j++) {
                System.out.println(names[j]);
            }

    }

    public void writeFile(String[] cruiseShipCabin) throws IOException {
        File file = new File("output.txt");
        FileWriter fw = new FileWriter(file);
        PrintWriter pw =new PrintWriter(fw);
        pw.println("");
        pw.println("<---------      Passenger Details     --------->");
        pw.println("");
        for (int i = 0; i < cruiseShipCabin.length; i++) {
            if (cruiseShipCabin[i] != null){
                pw.println("Cabin No "+(i+1)+" is reserved by "+cruiseShipCabin[i]);
                pw.println("");

            }
        }
        System.out.println("ALL DATA STORED");
        pw.close();
    }

    public void readFile(String[] cruiseShipCabin) throws FileNotFoundException {
        File file = new File("D:\\Cruise Ship Boarding task 1\\output.txt");
        Scanner scan = new Scanner(file);

        while (scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }

    }

    public static void removeCabin(String[] cruiseShipCabin) {
        System.out.print("Enter Cabin number : ");
        int removedCabin = parseInt(myObj.nextLine());
        cruiseShipCabin[removedCabin - 1] = null;
        System.out.println("removed cabin No :"+(removedCabin - 1));
    }


    public static void main(String[] args) {

    }



}
