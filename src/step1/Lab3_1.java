package step1;

import java.util.Scanner;

class Person {
    /********** Begin **********/
    // 自行设计类的实现
    String name;

    String sex;

    int age;

    /********** End **********/
}

class Student extends Person {
    /********** Begin **********/
    // 自行设计类的实现
    String no;

    String enter;

    String major;

    public Student(String name, String sex,int age,String no, String enter, String major) {
        super.name = name;
        super.sex = sex;
        super.age = age;
        this.no = no;
        this.enter = enter;
        this.major = major;
    }

    @Override
    public String toString() {
        return name+","+sex+','+age+','+no+','+enter+','+major;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getEnter() {
        return enter;
    }

    public void setEnter(String enter) {
        this.enter = enter;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    /********** End **********/
}

class Teacher extends Person {
    /********** Begin **********/
    // 自行设计类的实现
    String pro;

    String department;

    public Teacher(String name, String sex,int age,String pro, String department) {
        super.name = name;
        super.sex = sex;
        super.age = age;
        this.pro = pro;
        this.department = department;
    }

    @Override
    public String toString() {
        return name+','+sex+','+age+','+pro+','+department;
    }
    /********** End **********/
}

public class Lab3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.next(), sc.next());
        Teacher teacher = new Teacher(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.next());
        System.out.println("学生基本信息为:" + student);
        System.out.println("教师的信息为:" + teacher);
        sc.close();
    }

}
