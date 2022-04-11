public class GenericMethodEg{
    public static void main(String[] args) {
        Gen genM=new Gen();
        genM.<String> genMethod("Gen Method");
        genM.<Integer> genMethod(7);
        }
    }
   class Gen {
        //create a generic method
        public <T> void genMethod(T data) {
            System.out.println("Data Passed "+" "+data);
        }
        }    
//Create a Generic Method
