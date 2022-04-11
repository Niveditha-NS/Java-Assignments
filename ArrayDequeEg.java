import java.util.ArrayDeque;

class ArrayDequeEg{
    public static void main(String[] args) {
        ArrayDeque<Integer> evenNumbers=new ArrayDeque<>();
        evenNumbers.add(2);
        evenNumbers.add(6);
        evenNumbers.add(4);
        evenNumbers.addFirst(8);
        System.out.println(evenNumbers);
    }
}