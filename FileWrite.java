import java.io.*;

class FileWrite{
    public static void main(String[] args) {
        FileOutputStream output=null;
        String data="\nThis is the addition to the test file";
        try {
            output=new FileOutputStream("d:\\test.txt",true);
            byte[] array=data.getBytes();
            output.write(array);
            output.close();
            output =new FileOutputStream("d:\\test1.txt");
            output.write(data.getBytes());
            
            output.flush();
            output.close();
            
        }
        catch (Exception e) {
            e.getStackTrace();
        }
        }
    }