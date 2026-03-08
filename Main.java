import java.util.*;
public class Main{
public static void main (String [] args){
Scanner sc = new Scanner (System.in);

String[] students = {"Dwight", "Jexkean", "Christian", "Kyle", "Chester", "Kiel", "Russel", "Paul", "Joseph", "Seanjay"};
double[] grades = {76.8, 96.9, 99.1, 95.4, 97.2, 96.8, 94.2, 92.8, 93.8, 99.8};

double sum = 0;
for (double grade : grades){
sum += grade;    
}
double average = sum / grades.length; 
System.out.println("Average grade: " +average);

for (int i = 0; i < grades.length - 1; i++) {
for (int j = 0; j < grades.length - i - 1; j++){
if (grades[j] > grades[j + 1]){ 

double tGrades = grades[j];
grades[j] = grades[j + 1];
grades[j + 1] = tGrades;

String tStudents = students[j];
students[j] = students[j + 1];
students[j + 1] = tStudents;

  }    
 }
}

System.out.println("Enter student name: ");
String name = sc.nextLine();

boolean found = false;
for (int i = 0; i < students.length; i++){
if (students[i].equalsIgnoreCase(name)){
System.out.println("Student: " +students[i]+ " | Grade: " +grades[i]);
found = true;
break;
}

   }
  }   
 }

