interface Printable {

    void print();

    default void Welcome() {
        System.out.println("Welcome TO ARJUN'S MANAGEMENT : ");
    }

    static void info() {
        System.out.println("My interface");
    }


}
