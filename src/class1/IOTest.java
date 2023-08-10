package class1;

import java.io.*;

public class IOTest {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:\\Download\\1.txt");
            FileOutputStream fos = new FileOutputStream("D:\\Download\\2.txt");
            byte[] bytes = new byte[1024];
            int i ;
            while ((i = fis.read(bytes))!= -1){
                fos.write(bytes,0,i);
            }
            fos.close();
            fis.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//    public static void main(String[] args) {
//        try {
//            FileOutputStream fos = new FileOutputStream("D:\\Download\\1.txt",true);
//            fos.write("你好".getBytes());
//            fos.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
    }
}
