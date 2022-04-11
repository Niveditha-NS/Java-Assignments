//Create a Generic Class
class Gen<T>{
    //    Filed of T type
    T data;
    //    Constructor
    Gen (T data){
        this.data=data;
    }
    //    method for the generic class
    public T getData() {
        return this.data;
    }
    
    }public class GenericEg{
    public static void main(String[] args) {
        Gen<Integer> intObj=new Gen<>(7);
        System.out.println("Generic Class Returns" + " "+intObj.getData());
        // String
        Gen<String> strObj=new Gen<>("Generic Class in play");
        System.out.println("Generic Class Returns" + " "+strObj.getData());
        }
       
    }
