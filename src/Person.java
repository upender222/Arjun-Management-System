abstract class Person {

    private String name;
    private  int age;

    Person(String name,int age)
    {
        setName(name);
        setAge(age);
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()) {
            System.out.println("Invalid name");
            return;
        }
        this.name = name;
    }
    public void setAge(int age) {
        if(age <=0) {
            System.out.println("age cant be -ve");
            return;
        }

        this.age = age;
    }

    public String getNamm() {

        return name;
    }
    public int getAg()
    {
        return age;
    }

     abstract   void displayDetails();


}
