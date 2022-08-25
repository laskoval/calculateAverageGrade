//Programmer: Lidia Laskova
//Last edit date: 5/1/2022
//The purpose of the program is to calculate 2 averages and display grades
//Input that you can use:
/*
Number of exams: 5
Number of students: 6
Student ID # Exam 1 Exam 2 Exam 3 Exam 4 Exam 5
11111 90 90 80 90 90
22222 100 88 87 93 90
33333 80 80 80 80 72
44444 80 0 0 60 70
55555 70 68 66 64 62
66666 77 77 77 66 77
 */
package gradesaveragesofstudents;
import java.util.Scanner;
public class GradesAveragesOfStudents {

public static void main(String[] args) {
       //Introduction paragraph
     System.out.println("The program will ask you to type your students ID and their exam grades for  HIST-224 class.");
     System.out.println("When you will see questions, please enter integers. ");
     System.out.println("For each student you will see student ID, average, new average, lowest score and letter grade.");
     System.out.println("You will also see a summary report about class average, best average, letter grade statistic and number of records proceeded. ");

      //Declaration of variables
        
        double avg;
        double minimum_score;
        double NewAverage;
        int aCounter = 0;
        int bCounter = 0;
        int cCounter = 0;
        int dCounter = 0;
        int aCounter2 = 0;
        int bCounter2 = 0;
        int cCounter2 = 0;
        int dCounter2 = 0;
        double avgCalc = 0;
        int studentNum = 0;
        double avgCalcNew = 0;
        int studentNumNew = 0;

// Scanner statement
Scanner sc = new Scanner(System.in);

//First question, creating of an array of studentIDs
        System.out.println("How many students are you recording?");
        int studentAmount = sc.nextInt();
        int[] studentIDArray = new int[studentAmount];

//Second question, creating an array of student's scores
        System.out.println("How many scores are you entering?");
        int scoreAmount = sc.nextInt();
        int[] examScoresArray = new int[scoreAmount];

// Use loop, ask for ID and scores
            for (int i = 0; i < studentIDArray.length; i++) { //Main braces
            System.out.println("What is the Student ID?");
            studentIDArray[i] = sc.nextInt();
            for (int n = 0; n < examScoresArray.length; n++) {
                System.out.println("What is the exam score?");
                examScoresArray[n] = sc.nextInt();
            }
// Use loop, calculate the Average, and number of averages(for the summary report)
            double totalScore = 0;
            for (int m = 0; m < examScoresArray.length; m++) {
                totalScore = totalScore + examScoresArray[m];
            }
            avg = totalScore / examScoresArray.length;
            avgCalc = avgCalc + avg;
// Use loop, find the smallest score
            minimum_score = examScoresArray[0];
            int smallest_index = 0;
            for (int a = 1; a < examScoresArray.length; a++) {
                if (minimum_score > examScoresArray[a]) {
                    minimum_score = examScoresArray[a];
                    smallest_index = a;
                }
            }
//Calculate New Average
            
            NewAverage = (totalScore - minimum_score) / (examScoresArray.length - 1);
            avgCalcNew = avgCalcNew + NewAverage;
// Letter grade for the new average
            if (NewAverage >= 80) {
                aCounter2++;
            } else if (avg >= 60 && avg < 80) {
                bCounter2++;
            } else if (avg >= 40 && avg < 60) {
                cCounter2++;
            } else {
                dCounter2++;
            }
//Display data some data
           System.out.println("**************************");
           System.out.println("Student ID        " + studentIDArray[i]); 
           System.out.println("Average           " + avg);
           System.out.println("Lowest score      " + minimum_score);
           System.out.println("New Average       " + NewAverage);
 //Display Letter grade
            if (avg>=80)
               {
            System.out.println("Letter grade      " + "A");
            aCounter++;
               }
        else if(avg>=60 && avg<80)
                 {
           System.out.println("Letter grade       " + "B");
           bCounter++;
                  }
        else if(avg>=40 && avg<60)
        {
            System.out.println("Letter grade      " + "C");
            cCounter++;
        }
        else
        {
            System.out.println("Letter grade      " + "D");
            dCounter++;
        }
        System.out.println("**************************");
        studentNum++;
        studentNumNew++;
        }//Main braces fiinish here
// Calculate Class average and display summary report
 double classAverage;
System.out.println("Summary report: ");
classAverage = avgCalc /studentNum ;
System.out.println("The class average is " + classAverage);
// Calculate the Class Average based on best scores
double newClassAverage;
newClassAverage = avgCalcNew / studentNumNew;
System.out.println("The average based on best scores is " + newClassAverage);
//Display Number of A’s, B’s, C’s, D’s, and F’s (based on the best scores only)
System.out.println("The number of A letter grades based on best scores is " + aCounter2);
System.out.println("The number of B letter grades based on best scores is " + bCounter2);
System.out.println("The number of C letter grades based on best scores is " + cCounter2);
System.out.println("The number of D letter grades based on best scores is " + dCounter2);
//Display the total number of records processed.
System.out.println("The total number of records processed is " + studentAmount );
}
}