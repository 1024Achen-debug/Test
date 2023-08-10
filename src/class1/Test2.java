package class1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author 刘怡琛
 */
public class Test2 extends JFrame {
    public Test2(){
        setDefaultLookAndFeelDecorated(true);
        setSize(350, 200);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea jTextField = new JTextArea("",10,10);
        jTextField.setLineWrap(true);
        jTextField.setFont(new Font("",Font.PLAIN,20));
        JScrollPane scrollPane = new JScrollPane(jTextField);
        add(scrollPane,BorderLayout.EAST);
        JPanel jp1 = new JPanel();
        jp1.setLayout(new GridLayout(5,1,1,1));
        JCheckBox jCheckBox1 = new JCheckBox("斜体");
        JCheckBox jCheckBox2 = new JCheckBox("粗体");
        JRadioButton jCheckBox3 =  new JRadioButton("大字号");
        JRadioButton jCheckBox4 = new JRadioButton("中字号");
        JRadioButton jCheckBox5 = new JRadioButton("小字号");
        jp1.setSize(200,200);
        jp1.add(jCheckBox1);
        jp1.add(jCheckBox2);
        jp1.add(jCheckBox3);
        jp1.add(jCheckBox4);
        jp1.add(jCheckBox5);
        jCheckBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jCheckBox1.isSelected()){
                    if (jCheckBox3.isSelected() && jCheckBox2.isSelected()){
                        jTextField.setFont(new Font("斜体", Font.BOLD + Font.ITALIC, 50));
                    } else if (jCheckBox4.isSelected() && jCheckBox2.isSelected() ){
                        jTextField.setFont(new Font("斜体", Font.BOLD + Font.ITALIC, 40));
                    } else if (jCheckBox5.isSelected() && jCheckBox2.isSelected()) {
                        jTextField.setFont(new Font("斜体", Font.BOLD + Font.ITALIC, 10));
                    } else if (jCheckBox2.isSelected()) {
                        jTextField.setFont(new Font("斜体", Font.ITALIC + Font.BOLD, 20));
                    } else if (jCheckBox3.isSelected()) {
                        jTextField.setFont(new Font("斜体", Font.ITALIC, 50));
                    } else if (jCheckBox4.isSelected()) {
                        jTextField.setFont(new Font("斜体", Font.ITALIC, 40));
                    } else if (jCheckBox5.isSelected()) {
                        jTextField.setFont(new Font("斜体", Font.ITALIC, 10));
                    } else {
                        jTextField.setFont(new Font("斜体",Font.ITALIC,20));
                    }
                }else {
                    if (jCheckBox3.isSelected() && jCheckBox2.isSelected()) {
                        jTextField.setFont(new Font("粗体", Font.BOLD, 50));
                    } else if (jCheckBox2.isSelected() && jCheckBox4.isSelected()) {
                        jTextField.setFont(new Font("粗体", Font.BOLD, 40));
                    } else if (jCheckBox5.isSelected() && jCheckBox2.isSelected()) {
                        jTextField.setFont(new Font("粗体", Font.BOLD, 10));
                    } else if (jCheckBox3.isSelected()) {
                        jTextField.setFont(new Font("默认", Font.PLAIN, 50));
                    } else if (jCheckBox2.isSelected()) {
                        jTextField.setFont(new Font("粗体",Font.BOLD,20));
                    } else if (jCheckBox4.isSelected()) {
                        jTextField.setFont(new Font("粗体", Font.PLAIN, 40));
                    } else if (jCheckBox5.isSelected()) {
                        jTextField.setFont(new Font("粗体", Font.PLAIN, 10));
                    } else {
                        jTextField.setFont(new Font("默认", Font.PLAIN, 20));
                    }
                }
            }
        });
        jCheckBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jCheckBox2.isSelected()){
                    if (jCheckBox1.isSelected() && jCheckBox3.isSelected()){
                        jTextField.setFont(new Font("斜体", Font.ITALIC+Font.BOLD, 50));
                    } else if (jCheckBox1.isSelected() && jCheckBox4.isSelected()) {
                        jTextField.setFont(new Font("斜体", Font.ITALIC+Font.BOLD, 40));
                    } else if (jCheckBox1.isSelected() && jCheckBox5.isSelected()) {
                        jTextField.setFont(new Font("斜体", Font.ITALIC + Font.BOLD, 10));
                    } else if (jCheckBox1.isSelected() ) {
                        jTextField.setFont(new Font("粗体",Font.BOLD+Font.ITALIC,20));
                    } else if (jCheckBox3.isSelected()) {
                        jTextField.setFont(new Font("粗体", Font.BOLD, 50));
                    } else if (jCheckBox4.isSelected()) {
                        jTextField.setFont(new Font("粗体", Font.BOLD, 40));
                    } else if (jCheckBox5.isSelected()) {
                        jTextField.setFont(new Font("粗体", Font.BOLD, 10));
                    } else {
                        jTextField.setFont(new Font("粗体",Font.BOLD,20));
                    }
                }else {
                    if(jCheckBox1.isSelected()&& jCheckBox3.isSelected()){
                        jTextField.setFont(new Font("斜体",Font.ITALIC,50));
                    }else if (jCheckBox1.isSelected() && jCheckBox4.isSelected()) {
                        jTextField.setFont(new Font("斜体",Font.ITALIC,40));
                    } else if (jCheckBox1.isSelected() && jCheckBox5.isSelected()) {
                        jTextField.setFont(new Font("斜体", Font.ITALIC, 10));
                    } else if (jCheckBox1.isSelected()) {
                        jTextField.setFont(new Font("斜体", Font.ITALIC, 20));
                    } else if (jCheckBox3.isSelected()) {
                        jTextField.setFont(new Font("粗体", Font.PLAIN, 50));
                    } else if (jCheckBox4.isSelected()) {
                        jTextField.setFont(new Font("粗体", Font.PLAIN, 40));
                    } else if (jCheckBox5.isSelected()) {
                        jTextField.setFont(new Font("粗体", Font.PLAIN, 10));
                    } else {
                        jTextField.setFont(new Font("默认", Font.PLAIN, 20));
                    }
                }
            }
        });
        jCheckBox3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jCheckBox3.isSelected()) {

                    if (jCheckBox4.isSelected()){
                        jCheckBox4.setSelected(false);
                    }else if (jCheckBox5.isSelected()) {
                        jCheckBox5.setSelected(false);
                    }
                    if (jCheckBox1.isSelected() && jCheckBox2.isSelected()){
                        jTextField.setFont(new Font("斜体", Font.ITALIC + Font.BOLD, 50));
                    }else if(jCheckBox1.isSelected()){
                        jTextField.setFont(new Font("斜体",Font.ITALIC,50));
                    }else if (jCheckBox2.isSelected()){
                        jTextField.setFont(new Font("粗体", Font.BOLD, 50));
                    } else{
                        jTextField.setFont(new Font("默认", Font.PLAIN, 50));
                    }
                }else {
                    if(jCheckBox1.isSelected()){
                        jTextField.setFont(new Font("斜体",Font.ITALIC,20));
                    }else if (jCheckBox2.isSelected()){
                        jTextField.setFont(new Font("粗体", Font.BOLD, 20));
                    } else{
                        jTextField.setFont(new Font("默认", Font.PLAIN, 20));
                    }
                }
            }
        });
        jCheckBox4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jCheckBox4.isSelected()) {
                    if (jCheckBox3.isSelected()){
                        jCheckBox3.setSelected(false);
                    }else if (jCheckBox5.isSelected()) {
                        jCheckBox5.setSelected(false);
                    }
                    if (jCheckBox1.isSelected() && jCheckBox2.isSelected()){
                        jTextField.setFont(new Font("斜体", Font.ITALIC + Font.BOLD, 40));
                    }else if(jCheckBox1.isSelected()){
                        jTextField.setFont(new Font("斜体",Font.ITALIC,40));
                    }else if (jCheckBox2.isSelected()){
                        jTextField.setFont(new Font("粗体", Font.BOLD, 40));
                    } else{
                        jTextField.setFont(new Font("默认", Font.PLAIN, 40));
                    }
                }else {
                    if(jCheckBox1.isSelected()){
                        jTextField.setFont(new Font("斜体",Font.ITALIC,20));
                    }else if (jCheckBox2.isSelected()){
                        jTextField.setFont(new Font("粗体", Font.BOLD, 20));
                    } else{
                        jTextField.setFont(new Font("默认", Font.PLAIN, 20));
                    }
                }
            }
        });
        jCheckBox5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jCheckBox5.isSelected()) {
                    if (jCheckBox4.isSelected()) {
                        jCheckBox4.setSelected(false);
                    } else if (jCheckBox3.isSelected()) {
                        jCheckBox3.setSelected(false);
                    }
                    if (jCheckBox1.isSelected() && jCheckBox2.isSelected()) {
                        jTextField.setFont(new Font("斜体", Font.ITALIC + Font.BOLD, 10));
                    }else if (jCheckBox1.isSelected()) {
                        jTextField.setFont(new Font("斜体", Font.ITALIC, 10));
                    }else if (jCheckBox2.isSelected()) {
                        jTextField.setFont(new Font("粗体", Font.BOLD, 10));
                    }else {
                        jTextField.setFont(new Font("默认", Font.PLAIN, 10));
                    }
                } else {
                    if (jCheckBox1.isSelected()) {
                        jTextField.setFont(new Font("斜体", Font.ITALIC, 20));
                    } else if (jCheckBox2.isSelected()) {
                        jTextField.setFont(new Font("粗体", Font.BOLD, 20));
                    }else {
                        jTextField.setFont(new Font("默认", Font.PLAIN, 20));
                    }
                }

            }
        });
        add(jp1,BorderLayout.WEST);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Test2();
    }
}
