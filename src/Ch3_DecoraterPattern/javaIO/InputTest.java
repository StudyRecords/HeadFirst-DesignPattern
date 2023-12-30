package Ch3_DecoraterPattern.javaIO;

import java.io.*;

public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;

        try{
            InputStream original = new BufferedInputStream(new FileInputStream("test.txt"));
            while((c = original.read()) >= 0){
                System.out.print((char)c);
            }
            System.out.println();
            original.close();

            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
            while((c = in.read()) >= 0){
                System.out.print((char)c);
            }
            in.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
