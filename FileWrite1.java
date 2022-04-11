import java.io.*;

class FilwWrite1{
    public static void main(String[] args) {
        String data="This is Byte Array addition to the test file";
        try {
//            FileOutputStream output=new FileOutputStream("d:\\test.txt",true);
            ByteArrayOutputStream output=new ByteArrayOutputStream();
            byte[] array=data.getBytes();
            output.write(array);
            String streamData=output.toString();
            System.out.print(streamData);
            output.close();
//            }
            
        }
        catch (Exception e) {
            e.getStackTrace();
        }
        }
    }