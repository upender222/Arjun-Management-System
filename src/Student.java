public class Student extends Person implements Printable {

   private int rollno;
   private int marks;



    Student(String name,int age,int rollno,int marks) {

        super(name, age);
         setRollno(rollno);

         setMarks(marks);
    }

    public  void setRollno(int rollno) {
        if(rollno < 0) {
            System.out.println("NO -ve rollno");
            return;
        }
        this.rollno = rollno;
    }


    public void setMarks(int marks) {
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid");
            return;
        }
        this.marks = marks;
    }

    public  int getRoll() {


        return rollno;
    }

    public int getMark() {
        return marks;
    }



   public void displayDetails() {
        System.out.println("name : "  + getNamm());
        System.out.println("age : "  + getAg());
        System.out.println("rollno : " + getRoll());
        System.out.println("marks : " + getMark());
        System.out.println();

    }
    public void print() {
        System.out.println("I am a student");
    }






    boolean isPass() {
        return getMark() >=35;
    }

}
