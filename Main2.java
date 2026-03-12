import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

String[] students = {"Dwight", "Jexkean", "Christian", "Kyle", "Chester", 
                             "Kiel", "Russel", "Paul", "Joseph", "Seanjay"};
double[] grades = new double[students.length];

System.out.println("Enter grades for each student:");
for (int i = 0; i < students.length; i++) {
      System.out.print(students[i] + ": ");
      grades[i] = sc.nextDouble();
      }
        
double sum = 0;
for (double grade : grades) {
    sum += grade;
    }

double average = sum / grades.length;
System.out.println("Average grade: " + average);

      
for (int i = 0; i < grades.length - 1; i++) {
for (int j = 0; j < grades.length - i - 1; j++) {
if (grades[j] > grades[j + 1]) {
double tGrades = grades[j];
grades[j] = grades[j + 1];
grades[j + 1] = tGrades;

String tStudents = students[j];
students[j] = students[j + 1];
students[j + 1] = tStudents;
    }
  }
}

sc.nextLine();
System.out.print("\nEnter student name to search: ");
String name = sc.nextLine();

boolean found = false;
for (int i = 0; i < students.length; i++) {
if (students[i].equalsIgnoreCase(name)) {
System.out.println("Student: " + students[i] + " | Grade: " + grades[i]);
found = true;
break;
  }
}

if (!found) {
System.out.println("Student not found.");
            }

        
    }
}
