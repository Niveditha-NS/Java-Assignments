import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
//import java.util.*;

public class SortingName {
    public static void main(String[] args) {
        ArrayList<Name1> n1=new ArrayList<Name1>();
        n1.add(new Name1(1,"Niveditha"));
        n1.add(new Name1(2,"annie"));
        n1.add(new Name1(4,"shruthi"));

        Collections.sort(n1);
            for(int i =0;i<n1.size();i++) {
                System.out.println(n1.get(i));
            }
        }        
}
