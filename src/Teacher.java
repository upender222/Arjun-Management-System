public class Teacher extends Person implements Printable {

    private int num;
    private String subject;
    private double salary;

    Teacher(int num,String name,int age,String subject,double  salary) {

        super(name,age);
        Setid(num);
        setSub(subject);
        setSal(salary);
    }
    public void Setid(int num) {
        if(num <0) {
            System.out.println("Can't be -ve");
            return;
        }
        this.num =num;
    }


    public void setSub(String subject) {
        if(subject == null ||subject.trim().isEmpty()) {
            System.out.println("Invalid name");
            return;
        }
        this.subject = subject;
    }
    public void setSal(double  salary) {
        if(salary <=0) {
            System.out.println("salary cant be -ve");
            return;
        }

        this.salary = salary;
    }

    public int getnum() {
        return num;
    }


    public String getSubject() {

        return subject;
    }
    public double getSalary()
    {
        return salary;
    }

    public  void displayDetails() {
        System.out.println("Name : " + getNamm());
        System.out.println("Age : " + getAg());
        System.out.println("rollno : " + getnum());
        System.out.println("marks : " + getSubject());
        System.out.println("Salary : " + getSalary());
        System.out.println();

    }

    public void print() {
        System.out.println("i am a teacher");
    }

    boolean isRich() {
        return salary > 50000;
    }



}
