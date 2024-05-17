/*
*Lionel Yates Jr
*Comp 163
*Sect 3
*Psuedo:
*This program calculates weighted exam scores by utilizing different coding method of grade count 
*/
import java.util.Scanner;

public class Prog9v2 {
	public static void main(String args[]) {
		double progAssign,homeAssign,labAssign,quizAssign,readingAssign,firstExam,secondExam,thirdExam,fourthExam;
		//variables for percentage
		double total;
		//mark input
		System.out.print("Enter marks of progAssignming:");
		progAssign= getFirstExam(0.15);
		System.out.print("Enter marks of homeAssign:");
		homeAssign= getFirstExam(0.1);
		System.out.print("Enter marks of lab:");
		labAssign= getFirstExam(0.05);
		System.out.print("Enter marks of quiz:");
		quizAssign= getFirstExam(0.1);
		System.out.print("Enter marks of reading:");
		readingAssign= getFirstExam(0.1);
		System.out.print("Enter marks of first exam:");
		firstExam= getFirstExam(0.05);
		System.out.print("Enter marks of second exam:");
		secondExam= getFirstExam(0.1);
		System.out.print("Enter marks of third exam:");
		thirdExam= getFirstExam(0.15);
		System.out.print("Enter marks of fourth exam:");
		fourthExam= getFirstExam(0.20);
		total = getGrade(progAssign,homeAssign,labAssign,quizAssign,readingAssign,firstExam,secondExam,thirdExam,fourthExam);
		System.out.print("The student Grade is: ");
		printLetterGrade(total);
		}
		 
		private static double getFirstExam(double firstExamWeight) {
		   int marks;
		   Scanner scanner = new Scanner(System.in);
		   marks = scanner.nextInt();
		     
		   return marks*firstExamWeight;
		}
		public static double getGrade(double homeAssign, double progAssign, double labAssign, double quizAssign, double readingAssign, double firstExam, double secondExam, double thirdExam, double finalExam) {
		   return homeAssign + progAssign + labAssign + quizAssign + readingAssign + firstExam + secondExam + thirdExam + finalExam;
		}
		public static void printLetterGrade(double total) {
		   if(total>=80) { System.out.print("A"); }
		   else if(total>=60 && total<80) {
		   System.out.print("B"); }
		   else if(total>=40 && total<60) {
		   System.out.print("C"); }
		   else {
		   System.out.print("F");
		   }
		}

}
