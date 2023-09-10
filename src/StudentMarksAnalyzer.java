import java.util.Scanner;

public class StudentMarksAnalyzer {
	 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // F1: Input Assignment Name
        System.out.print("Enter the assignment name: ");
        String assignmentName = scanner.nextLine();

        // F2: Input Students' Marks
        int[] marks = new int[30];
        for (int i = 0; i < 30; i++) {
            do {
                System.out.print("Enter mark for student " + (i + 1) + ": ");
                marks[i] = scanner.nextInt();
                if (marks[i] < 0 || marks[i] > 30) {
                    System.out.println("Invalid input. Mark must be between 0 and 30.");
                }
            } while (marks[i] < 0 || marks[i] > 30);
        }

        // F4: Print Assignment Name and Marks
        System.out.println("Assignment Name: " + assignmentName);
        for (int i = 0; i < 30; i++) {
            System.out.println("Student " + (i + 1) + " Mark: " + marks[i]);
        }
        
        // F5: Print Highest and Lowest Marks
        int maxMark = marks[0];
        int minMark = marks[0];
        for (int i = 1; i < 30; i++) {
            if (marks[i] > maxMark) {
                maxMark = marks[i];
            }
            if (marks[i] < minMark) {
                minMark = marks[i];
            }
        }
        System.out.println("Highest Mark: " + maxMark);
        System.out.println("Lowest Mark: " + minMark);
        
     // F6: Calculate Mean and Standard Deviation
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        double mean = (double) sum / 30;

        double squaredDiffSum = 0;
        for (int mark : marks) {
            squaredDiffSum += Math.pow((mark - mean), 2);
        }
        double variance = squaredDiffSum / 30;
        double standardDeviation = Math.sqrt(variance);

        System.out.println("Mean: " + mean);
        System.out.println("Standard Deviation: " + standardDeviation);


        scanner.close();
    }

}