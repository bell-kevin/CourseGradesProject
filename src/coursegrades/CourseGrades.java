package coursegrades;

/******************************************************************************
 * CourseGrades.java 
 * Programmer: @author jcboyd
 * Version: 1.0
 * Course: SDEV 2210
 *
 * This program simulates a grade book for a class
 *****************************************************************************/

import java.util.Scanner;

public class CourseGrades 
{
    public static void main(String[] args) 
    {
        //declarations
        Scanner stdIn = new Scanner(System.in);
        int numberTests;
        int numberStudents;
        GradeBook gradeBookMath;
        int select; //user choice for next action
        //preparatory input
        System.out.println("Ch 9 Course Grades by JC Boyd\n");
        System.out.print("How many students in the class? ");
        numberStudents = stdIn.nextInt();
        System.out.print("How many tests in the course? ");
        numberTests = stdIn.nextInt();
        stdIn.nextLine(); //flush newline
        //set up gradebook, enter grades, and display all grades
        gradeBookMath = new GradeBook(numberStudents, numberTests);
        gradeBookMath.getGrades();
        gradeBookMath.showGrades();
        //menu loop for next action
        do
        {
            System.out.println("\nEnter 1 (show all grades), "
                    + "2 (a student's average), 3 (a test average),"
                    + " or 4 (quit)");
            System.out.print("Enter your selection: ");
            select = stdIn.nextInt();
            switch (select)
            {
                case 1:
                    gradeBookMath.showGrades();
                    break;
                case 2:
                    gradeBookMath.studentAverage();
                    break;
                case 3:
                    gradeBookMath.testAverage();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid input");
            } //end switch
        } while (select != 4);
        
    } //end main
    
} //end class CourseGrades
