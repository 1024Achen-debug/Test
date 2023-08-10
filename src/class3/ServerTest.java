package class3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8011);
            Socket socket = serverSocket.accept();
            System.out.println("客户端连接成功");
            InputStream ins = socket.getInputStream();
            byte[] b = new byte[1024];
            int len = ins.read(b);
            System.out.println(new String(b, 0, len));
            OutputStream ops = socket.getOutputStream();
            ops.write("sia".getBytes());
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
