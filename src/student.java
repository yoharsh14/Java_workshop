public class student  {
private String name;
private int rollNo;
private float percentage;
private int rank;
private int marks;

public void setRollNo(int newRollNo){
    rollNo = newRollNo;
}
public int getRollNo(){
    System.out.println(rollNo);
    return rollNo;
}

public void  setName(String newName){
    this.name = newName;
}
public  String  getName(){
    System.out.println(name);
    return name;//encapsulation
}
//student(){
//
//}
//
//student(String name,int rollNo,float percentage){
//    this.name = name;
//    this.rollNo = rollNo;
//    this.percentage = percentage;
//    rank = -1;
//
//}
//student(String sName, int rollNo, float percentage, int rank){
//    name = sName;
//    this.rollNo = rollNo;
//    this.percentage = percentage;
//    this.rank = rank;
//}
//void isDirectAdmission(){
//    if(rank ==-1){
//        System.out.println(name+" Direct Admission");
//    }
//    else {
//        System.out.println(name+" thorugh Rank");
//    }
//}
//
//    public static void main(String[] args) {
//        student stud =new student("Deepak",1,13.12F);
//        student stud2 = new student("harsh",2,13.21F,21);
//        student stud3 = new student();
//        stud3.name = "himanshi";
//        stud2.isDirectAdmission();
//        stud.isDirectAdmission();
//        stud3.isDirectAdmission();
//
//    }
}

