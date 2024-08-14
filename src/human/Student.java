package human;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Human {

    int knowledge;
    int marks;
    void  study(){
        knowledge =(int)(0+(Math.random()*(100+1)));
    }
    void giveExam(){
        marks = (int)(knowledge+Math.random()*(100+1));
    }
    void printMarks(){
        System.out.println(name+"->"+marks);
    }

}
