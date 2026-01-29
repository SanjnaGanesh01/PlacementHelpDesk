package placement;

import java.util.Scanner;

public class PlacementGuide {

    public static void main(String[] args) {
        // Step 1: Create some Role objects
        Role softwareEngineer = new Role(
            "Software Engineer",
            "Java, Data Structures, Algorithms, Problem Solving",
            "Practice coding problems daily and understand core CS concepts"
        );

        Role dataAnalyst = new Role(
            "Data Analyst",
            "SQL, Excel, Data Visualization, Statistics",
            "Work on small projects and learn to interpret data patterns"
        );

        Role uiDesigner = new Role(
            "UI Designer",
            "Figma, Adobe XD, Creativity, UX Principles",
            "Build design portfolios and practice designing interfaces"
        );

        // Step 2: Menu loop
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== Placement Help Desk =====");
            System.out.println("1. Software Engineer");
            System.out.println("2. Data Analyst");
            System.out.println("3. UI Designer");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            System.out.println();

            switch(choice) {
                case 1:
                    softwareEngineer.displayRoleInfo();
                    break;
                case 2:
                    dataAnalyst.displayRoleInfo();
                    break;
                case 3:
                    uiDesigner.displayRoleInfo();
                    break;
                case 0:
                    System.out.println("Exiting... All the best for placements! 🚀");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while(choice != 0);

        sc.close();
    }
}
