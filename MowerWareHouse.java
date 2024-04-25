// NAME: Enrique Lockhart

// COURSE: COMP 167       SECTION: 03

// Date: 3.22.2024

// DESCRIPTION A code that will take inventory of mowers in a warehouse

import javax.swing.JFileChooser;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class MowerWareHouse {

    private static String storeName;
    private ArrayList<Mower> mowers = new ArrayList<Mower>();
    private Scanner input = null;

    public static MowerWareHouse mowerWareHouse = new MowerWareHouse();

    public MowerWareHouse() {

    }

    // the getter for StoreName
    public String getStoreName() {
        return this.storeName;

    }

    private LawnTractor readLawnTractor(LawnTractor tractor) {

        return null;
    }

    // Reading in the file
    public void readMowerData(String inputFileName) throws IOException {
        FileReader file = new FileReader(inputFileName);
        BufferedReader readThis = new BufferedReader(file);
        storeName = readThis.readLine();


// Getting the first couple lines of input to start my switch statements
        while (storeName != null) {
            String Manufacturer = readThis.readLine();
            int Year = Integer.parseInt(readThis.readLine());
            String serialNumber = readThis.readLine();
            String letter = readThis.readLine();


            switch (letter) {

                // Switch statement for case L
                case "L":
                    LawnTractor lawnTractor = new LawnTractor();
                    lawnTractor.setManufacturer(Manufacturer);
                    lawnTractor.setYear(Year); // May have problems occur here
                    lawnTractor.setSerialNumber(serialNumber);
                    lawnTractor.getEngine().setManufacturer(input.nextLine());
                    lawnTractor.getEngine().setHoursePower(input.nextDouble());
                    input.nextLine();
                    lawnTractor.getEngine().setCylinders(input.nextInt());
                    input.nextLine();
                    lawnTractor.setModel(input.nextLine());
                    lawnTractor.setDeckWidth(input.nextDouble());
                    if (input.hasNextLine()) {
                        input.nextLine();
                    }
                    mowers.add(lawnTractor);
                    break;

                // Switch statement for case C
                case "C":
                    CommercialMower commercialMower = new CommercialMower();
                    commercialMower.setManufacturer(Manufacturer);
                    commercialMower.setYear(Year);
                    commercialMower.setSerialNumber(serialNumber);
                    commercialMower.getEngine().setManufacturer(input.nextLine());
                    commercialMower.getEngine().setHoursePower(input.nextDouble());
                    input.nextLine();
                    commercialMower.getEngine().setCylinders(input.nextInt());
                    input.nextLine();
                    commercialMower.setModel(input.nextLine());
                    commercialMower.setDeckWidth(input.nextDouble());
                    input.nextLine();
                    commercialMower.setOperatingHours(input.nextDouble());
                    input.nextLine();
                    commercialMower.setZeroTurnRadius(input.nextBoolean());
                    if (input.hasNextLine()) {
                        input.nextLine();
                    }
                    mowers.add(commercialMower);
                    break;


                // Switch statement for case G
                case "G":
                    GasPoweredMower gasPoweredMower = new GasPoweredMower();
                    gasPoweredMower.setManufacturer(Manufacturer);
                    gasPoweredMower.setYear(Year);
                    gasPoweredMower.setSerialNumber(serialNumber);
                    gasPoweredMower.setCutWidth(input.nextInt());
                    input.nextLine();
                    gasPoweredMower.setWheelDiameter(input.nextInt());
                    input.nextLine();
                    gasPoweredMower.getEngine().setManufacturer(input.nextLine());
                    gasPoweredMower.getEngine().setHoursePower(input.nextDouble());
                    input.nextLine();
                    gasPoweredMower.getEngine().setCylinders(input.nextInt());
                    input.nextLine();
                    gasPoweredMower.setSelfPropelled(input.nextBoolean());
                    if (input.hasNextLine()) {
                        input.nextLine();
                    }
                    mowers.add(gasPoweredMower);
                    break;

                // Switch statement for case P
                case "P":
                    PushReelMower pushReelMower = new PushReelMower();
                    pushReelMower.setManufacturer(Manufacturer);
                    pushReelMower.setYear(Year);
                    pushReelMower.setSerialNumber(serialNumber);
                    pushReelMower.setCutWidth(input.nextInt());
                    input.nextLine();
                    pushReelMower.setWheelDiameter(input.nextDouble());
                    input.nextLine();
                    pushReelMower.setNumWheels(input.nextInt());
                    if (input.hasNextLine()) {
                        input.nextLine();
                    }
                    mowers.add(pushReelMower);
                    break;
            }

        }
    }

    // save mower data method
    public void saveMowerData(String outputFileName) {

    }

    // The setter for StoreName
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }


    //add mower method
    public void addMower(Mower mower) {
        mowers.add(mower);
    }

    //mower getter

    public Mower getMower(int afawkingnumber) {
        return mowers.get(afawkingnumber);
    }

    // mower array setter

    public void setMower(int index, Mower replacement) {

        mowers.set(index, replacement);
    }

    // remove mower setter

    public void removeMower(int something) {
        mowers.remove(something);
    }

    // num mowers getter
    public int getNumMowers() {
        return mowers.size();
    }

    public String toString() {
        String StringMowers = "";
        for (int i = 0; i < mowers.size(); i++) {
            StringMowers += mowers.get(i).toString() + "\n";
        }

        return storeName + "\n" + StringMowers;
    }

    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);

        // get the file name if the users prompts ask that of it
        JFileChooser theJayFile = null;
        if (args.length > 0) {
            try {
                mowerWareHouse.readMowerData(args[0]);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            theJayFile = new JFileChooser();
            FileInputStream readThis;
        }

        theJayFile.setCurrentDirectory(new File("C:\\Users\\Ejloc\\OneDrive)"));
        int optionSelect = theJayFile.showSaveDialog(null);
        if (optionSelect == theJayFile.APPROVE_OPTION) {
            FileInputStream readThis = new FileInputStream(theJayFile.getSelectedFile().getAbsolutePath());
        }

        readMowerDate(theJayFile.getSelectedFile().getAbsolutePath());

        System.out.println("Enter your choice of Mower to get information");
        System.out.println("Type C for Commercial Mower, G for Gas Powered Mower, P for Push reel Mower, L for Lawn Tracotr, and S to stop");
        String choice = scnr.next();

        while (!choice.equals("S")) {
            for (int i = 0; i < mowerWareHouse.getNumMowers(); i++) {
                if ((mowerWareHouse.getMower(i) instanceof CommercialMower) && (choice.equals("C"))) {
                    System.out.println(mowerWareHouse.getMower(i));
                } else if ((mowerWareHouse.getMower(i) instanceof LawnTractor) && (choice.equals("L"))) {
                    System.out.println(mowerWareHouse.getMower(i));
                } else if ((mowerWareHouse.getMower(i) instanceof PushReelMower) && (choice.equals("P"))) {
                    System.out.println(mowerWareHouse.getNumMowers());
                } else if ((mowerWareHouse.getMower(i) instanceof GasPoweredMower) && (choice.equals("G"))) {
                    System.out.println(mowerWareHouse.getNumMowers());
                }
                }
            System.out.println("Type C for Commercial Mower, G for Gas Powered Mower, P for Push Reel Mower, L for Lawn Tractor, and S to Stop");
            choice = scnr.next();
        }

        }

        private static void readMowerDate (String absolutePath){
        }
    }



