import java.util.ArrayList;
import java.util.Collections;

 

public class Comp{
        public static void main(String[] args) {
            ArrayList<Student> stu=new ArrayList<Student>();
            stu.add(new Student(1,"xyz"));
            stu.add(new Student(2,"abc"));
            stu.add(new Student(4,"pqr"));
            stu.add(new Student(3,"lmn"));
            
//            Sorting By name
            Collections.sort(stu,new SortByName());
            for(int i =0;i<stu.size();i++) {
                System.out.println(stu.get(i));
            }
            
        }
}
    