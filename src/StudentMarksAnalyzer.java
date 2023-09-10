import java.util.Scanner;

public class StudentMarksAnalyzer {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // F1: Input Assignment Name
    System.out.print("Enter the assignment name: ");
    String assignmentName = scanner.nextLine();

    // F2: Input Students' Marks
    int[] marks = getValidMarks(scanner);

    // F4: Print Assignment Name and Marks
    System.out.println("Assignment Name: " + assignmentName);
    for (int i = 0; i < 30; i++) {
      System.out.println("Student " + (i + 1) + " Mark: " + marks[i]);
    }

    // F5: Print Highest and Lowest Marks
    int maxMark = getMaxMark(marks);
    int minMark = getMinMark(marks);
    System.out.println("Highest Mark: " + maxMark);
    System.out.println("Lowest Mark: " + minMark);

    // F6: Calculate Mean and Standard Deviation
    double mean = getMean(marks);
    double standardDeviation = getStandardDeviation(marks, mean);

    System.out.println("Mean: " + mean);
    System.out.println("Standard Deviation: " + standardDeviation);

    scanner.close();
  }

  // Function to get valid marks for 30 students
  static int[] getValidMarks(Scanner scanner) {
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
    return marks;
  }

  // Function to find the highest mark
  static int getMaxMark(int[] marks) {
    int maxMark = marks[0];
    for (int i = 1; i < marks.length; i++) {
      if (marks[i] > maxMark) {
        maxMark = marks[i];
      }
    }
    return maxMark;
  }

  // Function to find the lowest mark
  static int getMinMark(int[] marks) {
    int minMark = marks[0];
    for (int i = 1; i < marks.length; i++) {
      if (marks[i] < minMark) {
        minMark = marks[i];
      }
    }
    return minMark;
  }

  // Function to calculate the mean of marks
  static double getMean(int[] marks) {
    int sum = 0;
    for (int mark : marks) {
      sum += mark;
    }
    return (double) sum / marks.length;
  }

  // Function to calculate the standard deviation of marks
  static double getStandardDeviation(int[] marks, double mean) {
    double squaredDiffSum = 0;
    for (int mark : marks) {
      squaredDiffSum += Math.pow((mark - mean), 2);
    }
    double variance = squaredDiffSum / marks.length;
    return Math.sqrt(variance);
  }
}
