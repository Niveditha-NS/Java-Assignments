public class MultiCatch {
    public static void main(String[] args) {
        try{
        int n[]=new int[10];
        n[10]=30/0;
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Exception");
        }
    }
}
