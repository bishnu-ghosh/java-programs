class Constructor {

    String name;
    int age;

    // Parameterized Constructor
    Constructor(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Bishnu", 20);
        s1.display();
    }
}