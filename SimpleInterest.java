import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p=sc.nextInt();
        int n=sc.nextInt();
        int r=sc.nextInt();
        double simple=(p*n*r)/100;
        System.out.println(simple);
    }
}
