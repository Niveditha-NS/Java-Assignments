//import java.util.Set;
import java.util.HashSet;

 

class HashExample{
    public static void main(String[] args) {
        HashSet<Integer> primeNumbers=new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        HashSet<Integer> evenNumbers=new HashSet<>();
         evenNumbers.add(2);
         evenNumbers.add(4);
        evenNumbers.addAll(primeNumbers);
        System.out.println("union: "+evenNumbers);
        //         Intersection
         evenNumbers.retainAll(primeNumbers);
        System.out.println("intersection:"+evenNumbers);
        
    }
}