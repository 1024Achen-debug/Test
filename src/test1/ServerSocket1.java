package test1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocket1 extends JFrame{
    ServerSocket server = new ServerSocket(8000);
    Socket socket = server.accept();;
    OutputStream outputStream = socket.getOutputStream();
    InputStream inputStream = socket.getInputStream();
    JTextArea jtp = new JTextArea();
    JTextArea jta = new JTextArea();
    byte[] n = new byte[1024];

    class ServerRead extends Thread{
        public void run() {
            while (true) {
                try {
                    inputStream.read(n);
                    String message = new String(n);
                    jtp.append(message+ "\n");
                    n = new byte[1024];
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(jtp,e.getMessage());
                    return ;
                }
            }
        }
    }

    ServerSocket1() throws IOException {

        byte[] msg1 = new byte[1024];
        socket.setKeepAlive(true);
        String ms = "服务端：已连接";
        byte[] msg = ms.getBytes();
        outputStream.write(msg);
        setDefaultLookAndFeelDecorated(true);
        setSize(400,400);
        setLocationRelativeTo(null);
        setTitle("服务端");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        jtp.setEditable(false);
        jtp.setBackground(Color.black);
        jtp.setForeground(Color.white);
        JScrollPane js = new JScrollPane(jtp);
        js.setSize(400,200);
        add(js, BorderLayout.CENTER);
        jta.setBackground(Color.white);
        jta.setForeground(Color.black);
        jta.setFont(new Font("宋体", Font.BOLD, 20));
        JScrollPane js2 = new JScrollPane(jta);
        js2.setSize(400,200);
        JPanel jp1 = new JPanel();
        jp1.setLayout(new GridLayout(1,3,1,1));
        JButton jb1 = new JButton("发送");
        jb1.setSize(100,200);
        jp1.add(js2);
        jp1.add(jb1);
        add(jp1,BorderLayout.SOUTH);
        inputStream.read(msg1);
        String ms1 = new String(msg1);
        System.out.println(ms1);
        jtp.append(ms1);
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ms2 = "服务器："+jta.getText();
                System.out.println(ms2);
                byte[] n = ms2.getBytes();
                try {
                    outputStream.write(n);
                    jtp.append(ms2 + "\n");
                    jta.setText("");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        new ServerRead().start();
    }
    public static void main(String[] args) throws IOException {
        new ServerSocket1();
    }
}
