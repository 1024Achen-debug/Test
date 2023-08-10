package class1;

import javax.swing.*;
/**
 * @author 刘怡琛
 */
public class Cacilator extends  JFrame{
    public Cacilator(){
        setDefaultLookAndFeelDecorated(true);

        setSize(500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel jp = new JPanel();
        jp.setBounds(200,200,400,400);
        JLabel j1 = new JLabel("额呵呵呵呵");
        jp.add(j1);
        add(jp);


        pack();
        setVisible(true);

    }
    public static void main(String[] args) {
        new Cacilator();
    }
}
