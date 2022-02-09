package Lesson05HW;

public class employee {

    private String surname;
    private String secondaryname;
    private String name;
    private String position;
    private String mail;
    private int phoneNum;
    private int salary;
    private int age;

    public employee(
        String surname,
        String secondaryname,
        String name,
        String position,
        String mail,
        int phoneNum,
        int salary,
        int age)
    {

        this.surname = surname;
        this.secondaryname = secondaryname;
        this.name = name;
        this.position = position;
        this.mail = mail;
        this.phoneNum = phoneNum;
        this.salary = salary;
        this.age = age;
    }

    int getAge() {
        return age;
    }

    int getSalary() {
        return salary;
    }

    String getFullInfo() {
        return  this.surname + " " +
                this.secondaryname + " " +
                this.name + ", " +
                this.position + "  " +
                this.mail + " Phone number: " +
                this.phoneNum + " Salary is " +
                this.getSalary() + " RU " +
                this.getAge() + " year's old";
    }
}