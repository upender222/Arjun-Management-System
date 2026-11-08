import java.util.*;
public class Main {
  static Scanner sc = new Scanner(System.in);

  static Student[] s = new Student[100];
  static Teacher[] t = new Teacher[100];
  static  int Teachercount =0 ;

  static int Studentcount = 0;

  public static void displayMenu() {
    System.out.println("=============");
    System.out.println("ARJUN'S MANAGEMENT");
    System.out.println("==============");

    System.out.println("1. Add Student");
    System.out.println("2. View student");
    System.out.println("3.resultCheck");
    System.out.println("4. update data");
    System.out.println("5. delete student");
    System.out.println("6.Student Stastatics");
    System.out.println("7. Exit");

  }

  public static void show() {
    System.out.println("=============");
    System.out.println("ARJUN'S MANAGEMENT");
    System.out.println("==============");
    System.out.println();

    System.out.println("1.Update name");
    System.out.println("2.Update age");
    System.out.println("3.Update marks");
    System.out.println("4.Exit");
  }

  public static void displayStatistics(int pass, int fail, int sum, double average, int highest) {
    System.out.println("=============");
    System.out.println("ARJUN'S MANAGEMENT");
    System.out.println("==============");
    System.out.println();
    System.out.println("no of students passed : " + pass);
    System.out.println("no.of students failed : " + fail);
    System.out.println("total sum : " +sum);
    System.out.println("average  : " +average);
    System.out.println("highest number : " + highest);

  }


  public static void addStudent() {
    System.out.println("Enter no of students");
    int n = sc.nextInt();
    sc.nextLine();
    for (int i = 0; i < n; i++) {
      System.out.println("Enter student details");
      System.out.println();

      System.out.println("Enter Student Id");
      int rollno = sc.nextInt();
      sc.nextLine();
      System.out.println("Enter student name");
      String name = sc.nextLine();
      System.out.println("Enter Student age");
      int age = sc.nextInt();
      System.out.println("Enter marks");
      int marks = sc.nextInt();
      sc.nextLine();

      if (Studentcount == s.length) {
        System.out.println("Database Full");
        return;
      }

      if (search(rollno) != -1) {
        System.out.println("Already exist");
        continue;
      }

      s[Studentcount] = new Student(name, age,rollno, marks);
      Studentcount++;
    }
    System.out.println();
    System.out.println(Studentcount);

    System.out.println("Student added successfully");
  }


  public static void viewStudent() {

    if (Studentcount == 0) {
      System.out.println("NO students found");
      return;
    }


    for (int i = 0; i < Studentcount; i++) {
      Person p = s[i];
      p.displayDetails();
      Printable d = s[i];

      d.Welcome();
      d.print();
      Printable.info();
    }
    System.out.println("viewed successfully");
  }

  public static int search(int Id) {


    for (int i = 0; i < Studentcount; i++) {
      if (s[i].getRoll() == Id) {
        return i;
      }
    }
    return -1;


  }

  public static void resultCheck() {
    System.out.println("Enter id of student");
    int Id = sc.nextInt();
    int index = search(Id);
    if (index == -1) {
      System.out.println("not found");
      return;

    }
    System.out.println("The name of student is : " + s[index].getNamm());
    System.out.println("Age of the student is : " + s[index].getAg());
    System.out.println("Narksof the student is : " + s[index].getMark());

    if (s[index].isPass()) {
      System.out.println("pass");
    } else {
      System.out.println("fail");
    }
  }

  public static void Update() {
    System.out.println("Enter rollno");
    int rollno = sc.nextInt();
    sc.nextLine();

    int index = search(rollno);
    if (index == -1) {
      System.out.println("Not found");
      return;
    }


    boolean correct = true;
    while (correct) {
      show();

      int ch = sc.nextInt();
      sc.nextLine();

      switch (ch) {
        case 1:
          System.out.println("ENter new name");
          String newname = sc.nextLine();
          s[index].setName(newname);
          break;
        case 2:
          System.out.println("Enter new age");
          int agge = sc.nextInt();
          sc.nextLine();

          s[index].setAge(agge);
          break;
        case 3:
          System.out.println("enter new marks");
          int markk = sc.nextInt();
          sc.nextLine();
          s[index].setMarks(markk);
          break;
        case 4:
          correct = false;
          break;
        default:
          System.out.println("invalid choice");
          return;
      }


    }
  }



  public static void Delete() {
    System.out.println("Enter student roll no to delete");
    int rollno = sc.nextInt();
    sc.nextLine();
    int index = search(rollno);
    if(index == -1) {
      System.out.println("Not found");
      return;
    }
    System.out.println("student found");
    int i =index;
          while(i<Studentcount -1) {
            s[i] = s[i+1];
            i++;
          }
          s[Studentcount -1] = null;
          Studentcount--;
          System.out.println("deleted successfully");

  }

  public static void Statatics() {
    if(Studentcount == 0) {
      System.out.println("no students");
      return;
    }
    int pass =0;
    int fail =0;
    int sum =0;
    int highest = s[0].getMark();

    for(int i=0;i<Studentcount;i++)
    {
      if(s[i].isPass()) {
        pass++;
      }
      else {
        fail++;
      }
      sum += s[i].getMark();

      if(s[i].getMark()> highest) {
        highest = s[i].getMark();
      }
    }

    int average = (sum/Studentcount);

    displayStatistics(pass,fail, sum, average, highest);
  }


  public static void displayData() {
    System.out.println("=============");
    System.out.println("ARJUN'S MANAGEMENT");
    System.out.println("==============");

    System.out.println("1. Add Teacher");
    System.out.println("2. View Teachert");
    System.out.println("3.resultCheck");
    System.out.println("4. update data");
    System.out.println("5. delete Teacher");
    System.out.println("6. Teacher Stastatics");
    System.out.println("7. Exit");

  }

  public static void ShowTeacher() {

    System.out.println("=============");
    System.out.println("ARJUN'S MANAGEMENT");
    System.out.println("==============");
    System.out.println();

    System.out.println("1.Update name");
    System.out.println("2.Update age");
    System.out.println("3.Update salary");
    System.out.println("4.Exit");
  }

  public static void displayTeacherStatistics(int rich, int poor, double sum, double average, double highest) {
    System.out.println("=============");
    System.out.println("ARJUN'S MANAGEMENT");
    System.out.println("==============");
    System.out.println();
    System.out.println("no of teachers rich : " + rich);
    System.out.println("no.of teachers failed : " + poor);
    System.out.println("total sum : " +sum);
    System.out.println("average  : " +average);
    System.out.println("highest number : " + highest);

  }


  public static void addTeacher() {
    System.out.println("Enter no of Teachers");
    int n = sc.nextInt();
    sc.nextLine();
    for (int i = 0; i < n; i++) {
      System.out.println("Enter Teacher details");
      System.out.println();

      System.out.println("Enter Teacher Id");
      int num = sc.nextInt();
      sc.nextLine();
      System.out.println("Enter  Teacher name");
      String name = sc.nextLine();
      System.out.println("Enter Teacher age");
      int age = sc.nextInt();
      sc.nextLine();
      System.out.println("Enter subject");
      String subject = sc.nextLine();

      System.out.println("Enter salary :");
      double salary = sc.nextDouble();
      sc.nextLine();

      if (Teachercount == t.length) {
        System.out.println("Database Full");
        return;
      }

      if (searchTeacher(num) != -1) {
        System.out.println("Already exist");
        continue;
      }

      t[Teachercount] = new Teacher(num,name, age,subject,salary);
      Teachercount++;
    }
    System.out.println();
    System.out.println(Teachercount);

    System.out.println("Teacher added successfully");
  }


  public static void viewTeacher() {

    if (Teachercount == 0) {
      System.out.println("NO teachers found");
      return;
    }
    for (int i = 0; i < Teachercount; i++) {
      Person f = t[i];
      f.displayDetails();
      Printable r  = t[i];

      r.Welcome();
      r.print();
      Printable.info();
    }
    System.out.println("viewed successfully");
  }

  public static int searchTeacher(int num) {


    for (int i = 0; i < Teachercount; i++) {
      if (t[i].getnum() == num) {
        return i;
      }
    }
    return -1;


  }

  public static void TeacherresultCheck() {
    System.out.println("Enter id of Teacher");
    int Id = sc.nextInt();
    int index = searchTeacher(Id);
    if (index == -1) {
      System.out.println("not found");
      return;

    }
    System.out.println("The name of teacher is : " + t[index].getNamm());
    System.out.println("Age of the teacher is : " + t[index].getAg());
    System.out.println("subject of the teacher is : " + t[index].getSubject());

    if (t[index].isRich()) {
      System.out.println("rich");
    } else {
      System.out.println("poor");
    }
  }

  public static void UpdateTeacher() {
    System.out.println("Enter id");
    int ID = sc.nextInt();
    sc.nextLine();

    int index = searchTeacher(ID);
    if (index == -1) {
      System.out.println("Not found");
      return;
    }


    boolean correct = true;
    while (correct) {
      ShowTeacher();

      int ch = sc.nextInt();
      sc.nextLine();

      switch (ch) {
        case 1:
          System.out.println("ENter new name");
          String newname = sc.nextLine();
          t[index].setName(newname);
          break;
        case 2:
          System.out.println("Enter new age");
          int agge = sc.nextInt();
          sc.nextLine();

          t[index].setAge(agge);
          break;
        case 3:
          System.out.println("enter new salary");
          double sal = sc.nextInt();
          sc.nextLine();
          t[index].setSal(sal);
          break;
        case 4:
          correct = false;
          break;
        default:
          System.out.println("invalid choice");
          return;
      }


    }
  }



  public static void DeleteTeacher() {
    System.out.println("Enter teacher ID no to delete");
    int ID = sc.nextInt();
    sc.nextLine();
    int index = searchTeacher(ID);
    if(index == -1) {
      System.out.println("Not found");
      return;
    }
    System.out.println("teacher found");
    int i =index;
    while(i<Teachercount -1) {
      t[i] = t[i+1];
      i++;
    }
    t[Teachercount -1] = null;
    Teachercount--;
    System.out.println("deleted successfully");

  }

  public static void TeacherStatatics() {
    if(Teachercount == 0) {
      System.out.println("no teachers");
      return;
    }
    int rich =0;
    int poor =0;
    double sum =0;
    double highest = t[0].getSalary();

    for(int i=0;i<Teachercount;i++)
    {
      if(t[i].isRich()) {
        rich++;
      }
      else {
        poor++;
      }
      sum += t[i].getSalary();

      if(t[i].getSalary()> highest) {
        highest = t[i].getSalary();
      }
    }

    double average = sum/Teachercount;

    displayTeacherStatistics(rich,poor, sum, average, highest);
  }








  public static void main(String[] args) {

    boolean running = true;

    while (running) {

      System.out.println("=============");
      System.out.println("ARJUN'S MANAGEMENT");
      System.out.println("==============");
      System.out.println("1 . Student Management : ");
      System.out.println("2. Teacher Management : ");
      System.out.println("3. EXIT : ");
      int choice = sc.nextInt();
      sc.nextLine();

      switch (choice) {
        case 1:
          boolean studentMenu = true;

          while (studentMenu) {

            displayMenu();

            System.out.println("Enter choice:");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {

              case 1:
                addStudent();
                break;

              case 2:
                viewStudent();
                break;

              case 3:
                resultCheck();
                break;

              case 4:
                Update();
                break;

              case 5:
                Delete();
                break;

              case 6:
                Statatics();
                break;

              case 7:
                studentMenu = false;
                break;

              default:
                System.out.println("Invalid Choice");
            }

            System.out.println();
          }
          break;
        case 2:
          boolean TeacherMenu = true;

          while (TeacherMenu) {

            displayData();

            System.out.println("Enter choice:");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {

              case 1:
                addTeacher();
                break;

              case 2:
                viewTeacher();
                break;

              case 3:
                TeacherresultCheck();
                break;

              case 4:
                UpdateTeacher();
                break;

              case 5:
                DeleteTeacher();
                break;

              case 6:
                TeacherStatatics();
                break;

              case 7:
                TeacherMenu = false;
                break;

              default:
                System.out.println("Invalid Choice");
            }

            System.out.println();
          }
          break;

        case 3:
          running = false;
          break;
        default:
          System.out.println("invalid choice");
          return;
      }
      System.out.println();


    }


    }
  }



