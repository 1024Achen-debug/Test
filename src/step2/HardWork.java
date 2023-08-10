package step2;

abstract class Employee {
    public abstract double earnings();
}
class YearWorker extends Employee {

    //重写earnings()方法
    /********** Begin **********/
    @Override
    public double earnings() {
        return 100000;
    }

    /********** End **********/
}
class MonthWorker extends Employee {
    //重写earnings()方法
    /********** Begin **********/
    @Override
    public double earnings() {
        return 10000*12;
    }

    /********** End **********/
}
class WeekWorker extends Employee {
    //重写earnings()方法
    /********** Begin **********/
    @Override
    public double earnings() {
        return 5000*4*12;
    }

    /********** End **********/
}
class Company {
    Employee[] employees;
    double salaries = 0;
    Company(Employee[] employees) {
        this.employees = employees;
    }
    public double salariesPay() {
        salaries = 0;
        //计算salaries
        /********** Begin **********/
        for (Employee w:employees
        ) {
           salaries+=w.earnings();
        }
        /********** End **********/
        return salaries;
    }
}
public class HardWork {
    public static void main(String[] args) {
        Employee[] employees = new Employee[20];
        for (int i = 0; i < employees.length; i++) {
            if(i%3==0) {
                employees[i] = new WeekWorker();
            }
            else if(i%3==1) {
                employees[i] = new MonthWorker();
            }
            else if(i%3==2) {
                employees[i] = new YearWorker();
            }
        }
        Company company = new Company(employees);
        System.out.println("公司年工资总额:" + company.salariesPay());
    }
}
