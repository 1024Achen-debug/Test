package class1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test1 extends JFrame {

    public Test1(){
        setDefaultLookAndFeelDecorated(true);
        setTitle("整数加法器");
        setSize(350, 200);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jl1 = new JButton("清空");
        JPanel jp1 = new JPanel();
        jp1.setLayout(new GridLayout(4,3,5,5));
        JButton jb1 = new JButton("0");
        JButton jb2 =  new JButton("1");
        JButton jb3 = new JButton("2");
        JButton jb4 = new JButton("3");
        JButton jb5 = new JButton("7");
        JButton jb6 = new JButton("4");
        JButton jb7 = new JButton("5");
        JButton jb8 = new JButton("6");
        JButton jb9 = new JButton("8");
        JButton jb10 = new JButton("9");
        JButton jb11 = new JButton("加");
        JButton jb12 = new JButton("等于");
        jp1.add(jb1);
        jp1.add(jb2);
        jp1.add(jb3);
        jp1.add(jb4);
        jp1.add(jb5);
        jp1.add(jb6);
        jp1.add(jb7);
        jp1.add(jb8);
        jp1.add(jb5);
        jp1.add(jb9);
        jp1.add(jb10);
        jp1.add(jb11);
        jp1.add(jb12);
        jl1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jl1.setText("");
            }
        });
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(jb1.getText());
                if (jl1.getText().equals("0") || jl1.getText().equals("清空")) {
                    jl1.setText(""+num);
                }else {
                    jl1.setText(jl1.getText()+num);
                }
            }
        });
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(jb2.getText());
                if (jl1.getText().equals("0")|| "清空".equals(jl1.getText())) {
                    jl1.setText(""+num);
                }else {
                    jl1.setText(jl1.getText()+num);
                }
            }
        });
        jb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(jb3.getText());
                if (jl1.getText().equals("0")|| jl1.getText().equals("清空")) {
                    jl1.setText(""+num);
                }else {
                    jl1.setText(jl1.getText() + num);
                }
            }
        });
        jb4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(jb4.getText());
                if (jl1.getText().equals("0")|| jl1.getText().equals("清空")) {
                    jl1.setText(""+num);
                } else {
                    jl1.setText(jl1.getText() + num);
                }
            }
        });
        jb5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(jb5.getText());
                if (jl1.getText().equals("0")|| jl1.getText().equals("清空")) {
                    jl1.setText(""+num);
                } else {
                    jl1.setText(jl1.getText() + num);
                }
            }
        });
        jb6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(jb6.getText());
                if (jl1.getText().equals("0")|| jl1.getText().equals("清空")) {
                    jl1.setText(""+num);
                } else {
                    jl1.setText(jl1.getText() + num);
                }
            }
        });
        jb7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(jb7.getText());
                if (jl1.getText().equals("0")|| jl1.getText().equals("清空")) {
                    jl1.setText(""+num);
                } else {
                    jl1.setText(jl1.getText() + num);
                }
            }
        });
        jb8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(jb8.getText());
                if (jl1.getText().equals("0")|| jl1.getText().equals("清空")) {
                    jl1.setText(""+num);
                } else {
                    jl1.setText(jl1.getText() + num);
                }
            }
        });
        jb9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(jb9.getText());
                if (jl1.getText().equals("0")|| jl1.getText().equals("清空")) {
                    jl1.setText(""+num);
                } else {
                    jl1.setText(jl1.getText() + num);
                }
            }
        });
        jb10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(jb10.getText());
                if (jl1.getText().equals("0")|| jl1.getText().equals("清空")) {
                    jl1.setText(""+num);
                } else {
                    jl1.setText(jl1.getText() + num);
                }
            }
        });
        jb11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jl1.getText().equals("") || jl1.getText().equals("清空")){
                    jl1.setText("");
                }else  {
                    jl1.setText(jl1.getText()+"+");
                }
            }
        });
        jb12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] nums = null;
                if (!jl1.getText().equals("")) {
                  nums = jl1.getText().split("[+=]");
                }
                int sum = 0;
                for (String s:nums) {
                    System.out.println(s);
                   int num =  Integer.parseInt(s);
                   sum += num;
                }
                if (jl1.getText().equals("") || jl1.getText().equals("清空")) {
                    jl1.setText("");
                }else {
                    jl1.setText(jl1.getText()+"="+sum);
                }
            }
        });
        add(jp1,BorderLayout.CENTER);
        add(jl1,BorderLayout.NORTH);
        pack();
        setVisible(true);
    }
    public static void main(String[] args) {
        new Test1();
    }
}
