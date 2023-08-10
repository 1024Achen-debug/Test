package class3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTest {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",8011);
            OutputStream ops = socket.getOutputStream();
            String sio = "siia";
            byte[]  n = sio.getBytes();
            ops.write(n);
            InputStream ins = socket.getInputStream();
            byte[] b = new byte[1024];
            int len = ins.read(b);
            System.out.println(new String(b, 0, len));
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
