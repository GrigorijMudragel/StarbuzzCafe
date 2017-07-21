package mudragel.grigorij.study.designpatterns.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Grigorij_Mudragel on 7/21/2017.
 */
public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        try {
            InputStream in = new LowerCaseInputStresam(new BufferedInputStream( new FileInputStream("src/test.txt")));
            while ((c = in.read())>=0){
                System.out.print((char)c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
