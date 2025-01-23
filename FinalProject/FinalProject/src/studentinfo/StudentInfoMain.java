package studentinfo;

import java.io.FileWriter; 
import java.io.IOException;
import java.util.Scanner;

public class StudentInfoMain{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        StudentInfoList Students = new StudentInfoList();

        String InName;
        String InAddr;
        Double InGPA;
        String endInput = "";
        String endtest = "y";
        while( !endInput.equals(endtest)){
            System.out.println("Please enter the Students Name:");
            InName = input.nextLine();
            System.out.println("Please enter the Students address:");
            InAddr = input.nextLine();
            try{
                System.out.println("Please enter the Student GPA:");
                InGPA = input.nextDouble();
                input.nextLine();
            }
            catch(Exception error){
                System.out.println("Value entered is not a number");
                InGPA = -1.0;
            }
            StudentInfo newStudent = new StudentInfo(InName,InAddr,InGPA);
            Students.addItem(newStudent);
            System.out.println("Are you finish entering data? type y to exit:");
            endInput = input.nextLine();
            System.out.println(endInput);
        }
        Students.SortAlpha();
        try{
            FileWriter StudentDBFile = new FileWriter("Students.txt"); 
            StudentInfo pointer = Students.getStart();
            while(pointer != null){
                System.out.println("Writing "+ pointer.getName());
                StudentDBFile.write("Student Name: " + pointer.getName());
                StudentDBFile.write(System.lineSeparator());
                StudentDBFile.write("Student Address: " + pointer.getAddress());
                StudentDBFile.write(System.lineSeparator());
                StudentDBFile.write("Student GPA: " + pointer.getGPA());
                StudentDBFile.write(System.lineSeparator());
                StudentDBFile.write(System.lineSeparator());
                pointer = pointer.getNext();
            }
            StudentDBFile.close();
        } catch (IOException e){
            System.out.println("AN error occurred :(");
        }
        input.close();
     }
}