import java.util.ArrayDeque;
import java.util.Iterator;


class iterate{
    public static void main(String[] args) {
        ArrayDeque<Integer> evenNumbers=new ArrayDeque<>();
        evenNumbers.add(2);
        evenNumbers.add(6);
        evenNumbers.add(4);
        evenNumbers.addFirst(8);
//        Using Iterator
        Iterator<Integer> iterate=evenNumbers.iterator();
        while(iterate.hasNext()) {
            System.out.println(iterate.next());
        }
    }
}