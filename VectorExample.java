//import java.util.List;
import java.util.Vector;

 

class VectorExample{
    public static void main(String[] args) {
        Vector<String> mammals=new Vector<>();
        mammals.add("Dog");
        mammals.add("Cat");
        Vector<String> animals=new Vector<>();
        animals.addAll(mammals);
        System.out.println("Animals are:"+" "+animals);

        Vector<Integer> no=new Vector<>();
        no.add(23);
        no.add(18);
        Vector<Integer> numbers=new Vector<>();
        numbers.addAll(no);
        System.out.println("Numbers: "+numbers);

    }
}