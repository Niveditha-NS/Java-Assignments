//import java.util.List;
import java.util.ArrayList;

class Main{
    public static void main(String[] args) {
//        ArrayList Creation
    ArrayList<Integer> numbers=new ArrayList<>();
//    Adding Elements to the List
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    System.out.println("List is:"+ " "+numbers);
//    Accessing the elements in the list
    int number=numbers.get(1);
    System.out.println("Number is:"+ " "+number);
//    Removing element from the list
    int removedNumber=numbers.remove(2);
    System.out.println("Removed number is:"+ " "+removedNumber);

    ArrayList<String> s=new ArrayList<>();
    s.add("apple");
    s.add("ball");
    s.add("cat");
    System.out.println(s);

    ArrayList<Double> d=new ArrayList<>();
    d.add(50.2);
    d.add(16.6);
    System.out.println(d);
    }
}