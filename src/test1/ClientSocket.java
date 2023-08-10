package test1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientSocket extends JFrame{
    Socket socket = new Socket("localhost",8000);
    InputStream ips = socket.getInputStream();
    OutputStream ops = socket.getOutputStream();
    JTextArea jtp = new JTextArea();
    byte[] msg = new byte[1024];
    JTextArea jta = new JTextArea();

    class ServerRead extends Thread{
        public void run() {
            while (true) {
                try {
                    ips.read(msg);
                    String message = new String(msg);
                    jtp.append(message+ "\n");
                    msg = new byte[1024];
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(jtp,e.getMessage());
                }
            }
        }
    }

    ClientSocket() throws IOException {

        socket.setKeepAlive(true);
        setDefaultLookAndFeelDecorated(true);
        setSize(400,400);
        setLocationRelativeTo(null);
        setTitle("客户端");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        String ms = "客户端：已连接";
        ops.write(ms.getBytes());
        jtp.setEditable(false);
        jtp.setBackground(Color.black);
        jtp.setForeground(Color.white);
        jtp.setFont(new Font("宋体", Font.BOLD, 20));
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
        ips.read(msg);
        String ms1 = new String(msg);
        System.out.println(ms1);
        jtp.append(ms1);

        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ms2 = "客户端："+jta.getText();
                System.out.println(ms2);
                byte[] n = ms2.getBytes();
                try {
                    ops.write(n);
                    jta.setText("");
                    jtp.append(ms2+"\n");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        new ServerRead().start();
    }
    public static void main(String[] args) throws IOException {

        new ClientSocket();
    }
}
