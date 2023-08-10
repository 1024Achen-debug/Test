package class1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test extends JFrame {
    public Test() {
        super("Test");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JTextPane jTextPane = new JTextPane();
        add(jTextPane);
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Test();
    }
}
