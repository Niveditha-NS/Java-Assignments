import java.util.List;
import java.util.LinkedList;


public class LinkedList1{
    public static void main(String[] args) {
        List<Integer> numbers=new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        int index=numbers.indexOf(2);
        System.out.println("position is"+" "+index);
        System.out.println(numbers);

        List<String> s=new LinkedList<>();
        s.add("csk");
        s.add("mi");
        s.add("rcb");
        int index1=s.indexOf("mi");
        System.out.println("position is"+" "+index1);
        System.out.println(s);
    }
}