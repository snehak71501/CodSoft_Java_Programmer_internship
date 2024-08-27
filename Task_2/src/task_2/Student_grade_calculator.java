package task_2;
import java.util.Scanner;
public class Student_grade_calculator {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.print("\nEnter the Number Of Subjects: ");
	int num_subjects=scanner.nextInt();
	int[] Marks=new int [num_subjects];
	int total_marks=0;
	for(int i=0;i<num_subjects;i++) {
		System.out.print("\nMarks Obtained in "+(i+1)+ " Out of 100: ");
		Marks[i] =scanner.nextInt();
		total_marks+=Marks[i];
		}
	double average_percentage= (double) total_marks/num_subjects;
	String grade_calculation;
	if (average_percentage>=90 && average_percentage ==100 ) {
		grade_calculation= "A+";
		
	}
	else if(average_percentage>=80 ) {
		grade_calculation= "A";
		
	}
	else if(average_percentage>=70 ) {
		grade_calculation= "B";
		
	}
	else if(average_percentage>=60 ) {
		grade_calculation= "C";
		
	}
	
	else if(average_percentage>=50 ) {
		grade_calculation= "D";
		
	}
	else if(average_percentage<50 ) {
		grade_calculation= "Fail";
		
	}
	else {
		grade_calculation= "Invalid";
		
	}
	// Declaring results for students//
	System.out.print("\nResults: ");
	System.out.print("\nAverage Percentage: "+average_percentage);
	System.out.print("\nGrade: " +grade_calculation);
	
	}

}
