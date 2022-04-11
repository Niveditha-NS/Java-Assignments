import java.io.FileInputStream;


class FileRead{
    public static void main(String[] args) {
        try {
            FileInputStream input=new FileInputStream("d:\\test.txt");
            input.skip(7);
            int i =input.read();
            while(i!=-1) {
                System.out.print((char)i);
                i=input.read();
            }
            input.read();
            input.read();
            input.read();
            System.out.println(input.available());
            input.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
        }
    }

 


 