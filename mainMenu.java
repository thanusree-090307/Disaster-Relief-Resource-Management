package DRRM;

import java.util.Scanner;

public class mainMenu {

    static {
        System.out.println("------ Disaster Relief Resource Management ------");
    }

    static String getDisasterType(Scanner sc) {

        System.out.println("\nSelect Disaster Type:");
        System.out.println("1. Flood");
        System.out.println("2. Earthquake");
        System.out.println("3. Cyclone");
        System.out.println("4. Fire");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();

        if (choice == 1)
            return "Flood";
        else if (choice == 2)
            return "Earthquake";
        else if (choice == 3)
            return "Cyclone";
        else if (choice == 4)
            return "Fire";
        else {
            System.out.println("Invalid choice. Default Flood selected.");
            return "Flood";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AffectedAreas[] areas = new AffectedAreas[5];

        areas[0] = new AffectedAreas("Hyderabad", new Resource(500, 400, 300));
        areas[1] = new AffectedAreas("Chennai", new Resource(500, 400, 300));
        areas[2] = new AffectedAreas("Bangalore", new Resource(500, 400, 300));
        areas[3] = new AffectedAreas("Mumbai", new Resource(500, 400, 300));
        areas[4] = new AffectedAreas("Delhi", new Resource(500, 400, 300));

        int choice;

        do {
            System.out.println("\n1. Display Affected Areas");
            System.out.println("2. Distribute Resources");
            System.out.println("3. Track Available Resources");
            System.out.println("4. Generate Report");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            if (choice == 2) {

                System.out.print("Select Area (1-5): ");
                int index = sc.nextInt() - 1;

                if (index >= 0 && index < areas.length) {

                    String disaster = getDisasterType(sc);
                    areas[index].setDisasterType(disaster);

                    if (disaster.equals("Flood")) {

                        System.out.print("Enter Food quantity: ");
                        areas[index].resource.food -= sc.nextInt();

                        System.out.print("Enter Number of Water cans: ");
                        areas[index].resource.water -= sc.nextInt();

                        System.out.print("Enter Number of MedicalKits: ");
                        areas[index].resource.medicine -= sc.nextInt();

                        System.out.print("Enter Number of Boats: ");
                        areas[index].resource.boats += sc.nextInt();

                    } else if (disaster.equals("Earthquake")) {

                    	 System.out.print("Enter Food quantity: ");
                         areas[index].resource.food -= sc.nextInt();

                         System.out.print("Enter Number of Water cans: ");
                         areas[index].resource.water -= sc.nextInt();

                         System.out.print("Enter Number of MedicalKits: ");
                         areas[index].resource.medicine -= sc.nextInt();

                        System.out.print("Enter Number of Tents: ");
                        areas[index].resource.tents += sc.nextInt();

                    } else if (disaster.equals("Cyclone")) {

                    	 System.out.print("Enter Food quantity: ");
                         areas[index].resource.food -= sc.nextInt();

                         System.out.print("Enter Number of Water cans: ");
                         areas[index].resource.water -= sc.nextInt();

                         System.out.print("Enter Number of MedicalKits: ");
                         areas[index].resource.medicine -= sc.nextInt();

                        System.out.print("Enter Number of Shelters: ");
                        areas[index].resource.shelters += sc.nextInt();

                    } else if (disaster.equals("Fire")) {

                         System.out.print("Enter Number of Water cans: ");
                         areas[index].resource.water -= sc.nextInt();

                         System.out.print("Enter Number of MedicalKits: ");
                         areas[index].resource.medicine -= sc.nextInt();

                        System.out.print("Enter Number of Fire Extinguishers: ");
                        areas[index].resource.fireExtinguishers += sc.nextInt();
                    }

                    System.out.println("Resources distributed successfully.");
                }

            } else if (choice == 3) {

                for (int i = 0; i < areas.length; i++) {
                    areas[i].display();
                    System.out.println();
                }

            } else if (choice == 1) {

                for (int i = 0; i < areas.length; i++) {
                    System.out.println((i + 1) + ". " + areas[i].getName());
                }

            } else if (choice == 4) {

                ReportManager.generateReport(areas);

            } else if (choice == 0) {

                System.out.println("Exiting system...");
            }

        } while (choice != 0);

        sc.close();
    }
}
