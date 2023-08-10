package step4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface IStudentDAO{
    // 插入学生信息记录
    public void insertStudent(Student stu);
    // 删除指定学号学生信息记录
    public void deleteStudent(String sno);
    // 更新指定学生信息记录
    public void updateStudent(Student stu);
    // 按学号查询指定学生信息记录
    public Student findStudentBySno(String sno);
    // 显示指定学号学生信息记录
    public void displayStudentBySno(String sno);
    // 显示所有学生信息记录
    public void displayAllStudent();
}

class StudentDAOImpl implements IStudentDAO{
    List<Student> students = new ArrayList();
    @Override
    public void insertStudent(Student stu) {
        students.add(stu);
    }

    @Override
    public void deleteStudent(String sno) {
        int index = 0;
        Student t = null;
        for (Student s:students) {
            if (s.sno.equals(sno)){
                t=s;
            }
            index++;
        }
        students.remove(t);
    }

    @Override
    public void updateStudent(Student stu) {
        for (Student s:students) {
            if (s.sno.equals(stu.sno)){
                s.sname = stu.sname;
                s.sdept = stu.sdept;
            }
        }
    }

    @Override
    public Student findStudentBySno(String sno) {
        Student s1 = null;
        for (Student s :students) {
            if (s.sno.equals(sno)){
                s1= s;
            }
        }
        return s1;
    }

    @Override
    public void displayStudentBySno(String sno) {
        for (Student s :students) {
            if (s.sno.equals(sno)){
                System.out.println(s.toString());
            }
        }
    }

    @Override
    public void displayAllStudent() {
        if (students.size() > 0) {
            for (Student stu : students) {
                System.out.println(stu);
            }
        } else {
            System.out.println("数据库中无学生记录!");
        }
    }
}

public class Student {
    /********** Begin **********/
    String sno;

    String sname;

    String sdept;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSdept() {
        return sdept;
    }

    public void setSdept(String sdept) {
        this.sdept = sdept;
    }

    @Override
    public String toString() {
        return "学号: "+sno+" 姓名: "+sname+"\t系部: "+sdept;
    }

    /********** End **********/
}

class MainClass{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentDAOImpl studentDAOImpl = new StudentDAOImpl();
        //1. 插入学生信息
        Student stu = new Student();
        stu.setSno(scanner.next());
        stu.setSname(scanner.next());
        stu.setSdept(scanner.next());
        studentDAOImpl.insertStudent(stu);
        //2. 显示插入学生信息
        System.out.println("1. 插入学生信息如下：");
        studentDAOImpl.displayAllStudent();
        //3. 更新学生信息
        stu.setSname("李四");
        stu.setSdept("计算机系");
        studentDAOImpl.updateStudent(stu);
        System.out.println("2. 更新后学生信息如下：");
        System.out.println(studentDAOImpl.findStudentBySno(stu.getSno()));
        //4. 删除指定学生信息
        System.out.println("3. 删除当前学号学生信息：" + stu.getSno());
        studentDAOImpl.deleteStudent(stu.getSno());
        System.out.println("学生信息已删除!");
        //2. 显示插入学生信息
        System.out.println("5. 显示所有学生信息：");
        studentDAOImpl.displayAllStudent();
        scanner.close();
    }
}