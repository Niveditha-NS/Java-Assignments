import java.util.ArrayList;


class Foreacheg{
    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers=new ArrayList<>();
        evenNumbers.add(2);
        evenNumbers.add(6);
        evenNumbers.add(4);
        evenNumbers.add(8);
        for(int num:evenNumbers) {
            System.out.println(num);
        }
    }
}
 