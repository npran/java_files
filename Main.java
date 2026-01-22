import java.util.Scanner;

class Project {
    String name;
    int completionTime;

    // Parameterized constructor
    Project(String name, int completionTime) {
        this.name = name;
        this.completionTime = completionTime;
    }

    // Static method to calculate statistics
    public static void calculateStatistics(Project[] projects) {
        int n = projects.length;
        double sum = 0;

        // Calculate sum of completion times
        for (int i = 0; i < n; i++) {
            sum += projects[i].completionTime;
        }

        // Calculate average
        double average = sum / n;

        // Find project with maximum deviation
        double maxDeviation = -1;
        Project maxProject = projects[0];

        for (int i = 0; i < n; i++) {
            double deviation = Math.abs(projects[i].completionTime - average);
            if (deviation > maxDeviation) {
                maxDeviation = deviation;
                maxProject = projects[i];
            }
        }

        // Output
        System.out.printf("%.2f\n", average);
        System.out.println(maxProject.name);
        System.out.println(maxProject.completionTime);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Project[] projects = new Project[n];

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int time = sc.nextInt();
            sc.nextLine(); // consume newline

            projects[i] = new Project(name, time);
        }

        Project.calculateStatistics(projects);
        sc.close();
    }
}

