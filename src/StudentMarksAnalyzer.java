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
        scanner.close();
    }

}