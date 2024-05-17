
import java.util.Scanner;
public class Prog9
{
public static void main(String args[]) {
double program,homework,lab,quiz,reading,firstExam,secondExam,thirdExam,fourthExam;
//variables for percentage
double total;
//mark input
System.out.print("Enter marks of Programming:");
program= getFirstExam(0.15);
System.out.print("Enter marks of homework:");
homework= getFirstExam(0.1);
System.out.print("Enter marks of lab:");
lab= getFirstExam(0.05);
System.out.print("Enter marks of quiz:");
quiz= getFirstExam(0.1);
System.out.print("Enter marks of reading:");
reading= getFirstExam(0.1);
System.out.print("Enter marks of first exam:");
firstExam= getFirstExam(0.05);
System.out.print("Enter marks of second exam:");
secondExam= getFirstExam(0.1);
System.out.print("Enter marks of third exam:");
thirdExam= getFirstExam(0.15);
System.out.print("Enter marks of fourth exam:");
fourthExam= getFirstExam(0.20);
total = getGrade(program,homework,lab,quiz,reading,firstExam,secondExam,thirdExam,fourthExam);
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
   System.out.print("D");
   }
}
}
  



