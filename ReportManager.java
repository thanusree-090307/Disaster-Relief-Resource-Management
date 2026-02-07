package DRRM;

import java.io.FileWriter;
import java.io.IOException;

public class ReportManager {

    public static void generateReport(AffectedAreas[] areas) {

        try {
            FileWriter fw = new FileWriter("DisasterReport.txt");

            fw.write("===== Disaster Relief Resource Report =====\n\n");

            for (int i = 0; i < areas.length; i++) {
                fw.write("Area Name     : " + areas[i].name + "\n");
                fw.write("Disaster Type : " + areas[i].disasterType + "\n");
                fw.write("Food          : " + areas[i].resource.food + "\n");
                fw.write("Water         : " + areas[i].resource.water + "\n");
                fw.write("Medicine      : " + areas[i].resource.medicine + "\n");
                fw.write("Boats         : " + areas[i].resource.boats + "\n");
                fw.write("Tents         : " + areas[i].resource.tents + "\n");
                fw.write("Shelters      : " + areas[i].resource.shelters + "\n");
                fw.write("Fire Ext      : " + areas[i].resource.fireExtinguishers + "\n");
                fw.write("----------------------------------\n");
            }

            fw.close();
            System.out.println("Report generated successfully.");

        } catch (IOException e) {
            System.out.println("Error while writing report.");
        }
    }
}
