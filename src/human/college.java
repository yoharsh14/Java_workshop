package human;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.IntStream;

public class college {
    int kid;
    int har;
    public static void main(String[] args) {

//        int nStudent,nTeachers;
        Scanner scan = new Scanner(System.in);
//        System.out.print("enter number of students:");
//        nStudent = scan.nextInt();
//        System.out.print("enter number of teachers:");
//        nTeachers = scan.nextInt();
//         Student[] stuArr = new Student[nStudent];
//          Teacher[] teachArr = new Teacher[nTeachers];
        ArrayList<Student> stuArr = new ArrayList<>();
        ArrayList<Teacher> TeachArr = new ArrayList<>();
        for (Student student:stuArr) {
            System.out.print("enter student name:");
            scan.nextLine();
            student.name = scan.nextLine();
            System.out.print("enter student name:");
            student.id = scan.nextInt();
            student.study();
            student.giveExam();
            stuArr.add(student);
        }
        for (Student student : stuArr) {
            student.printMarks();
        }
          for (Teacher teacher: TeachArr){
              System.out.print("enter name of teacher:");
              scan.nextLine();
              teacher.name = scan.nextLine();
              System.out.print("enter id of teacher:");
              teacher.id = scan.nextInt();
              TeachArr.add(teacher);

          }
        for (Teacher teacher : TeachArr) {
            teacher.teachStudents();
        }
          int max =-1,min =100;
        for (Student student : stuArr) {
            int marks = student.marks;

            if (marks > max) {
                max = marks;
            } else if (marks < min) {
                min = marks;
            }
        }
    }
    }
