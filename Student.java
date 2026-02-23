class Student {

    String name;
    int age;

    // Default constructor
    Student() {
        name = "alom";
        age = 21;
    }

    // One parameter constructor
    Student(String n) {
        name = n;
        age = 18;
    }

    // Two parameter constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        new Student().display();
        new Student("krish").display();
        new Student("Raj", 20).display();
    }
}