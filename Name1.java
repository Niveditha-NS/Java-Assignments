import java.lang.*;
import java.io.*;
public class Name1 implements Comparable<Name1>{
    private String studentname;
    private int rollno;

    public Name1(int rollno, String studentname) {
        this.rollno = rollno;
        this.studentname = studentname;
    }
    public String getStudentname() {
        return studentname;
   }
   public void setStudentname(String studentname) {
   this.studentname = studentname;
   }
   public int getRollno() {
   return rollno;
   }
   public void setRollno(int rollno) {
   this.rollno = rollno;
   }
    //getter and setter methods same as the above example 
    @Override
    public int compareTo(Name1 comparestu) {
        String comparename=((Name1)comparestu).getStudentname();
        /* For Ascending order*/
        return this.studentname.length()-comparename.length();

        /* For Descending order do like this */
        //return compareage-this.studentage;
    }

    @Override
    public String toString() {
        return "rollno: " + rollno + " name: " + studentname + " ";
    }

}