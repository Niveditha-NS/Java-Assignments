//import java.util.Set;
import java.util.LinkedHashSet;


class LinkHashEg{
    public static void main(String[] args) {
        LinkedHashSet<Integer> primeNumbers=new LinkedHashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        LinkedHashSet<Integer> evenNumbers=new LinkedHashSet<>();
         evenNumbers.add(2);
         evenNumbers.add(4);
//         Intersection
         evenNumbers.addAll(primeNumbers);
        System.out.println("union is:"+evenNumbers);
    }
}