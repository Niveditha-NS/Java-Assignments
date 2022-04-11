import java.util.*;
import java.lang.*;
import java.io.*;
class Student {
     String name;
     int rollno;
    public Student(int rollno,String name) {
        this.name=name;
        this.rollno=rollno;
    }
    
    public String toString() {
        return this.name + this.rollno;
    }
    }
//Class to Compare by Rollno
class SortByRollNo implements Comparator<Student>{
    public int compare(Student a,Student b) {
        return a.rollno-b.rollno;
    }
}
//Class to Compare By Name
class SortByName implements Comparator<Student>{
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }
}