class InvalidInputException  extends Exception  
{  
    public InvalidInputException (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}  
    
public class CustomException {
    static void validate (int x) throws InvalidInputException{    
        if(x < 0){  
   
         // throw an object of user defined exception  
         throw new InvalidInputException("Invalid input");    
     }  
        else {   
         System.out.println("Valid input");   
         }   
      }    
   
     // main method  
     public static void main(String args[])  
     {  
         try  
         {  
             // calling the method   
             validate(-1);  
         }  
         catch (InvalidInputException ex)  
         {  
             System.out.println("Caught the exception");  
     
             // printing the message from InvalidAgeException object  
             System.out.println("Exception occured: " + ex);  
         }  
    }
}
