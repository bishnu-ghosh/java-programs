class Swap {

    int num1, num2;

    Swap(int a, int b) {
        num1 = a;
        num2 = b;
    }

    void swapNumbers(Swap obj) {
        int temp = obj.num1;
        obj.num1 = obj.num2;
        obj.num2 = temp;
    }

    void display() {
        System.out.println("First Number = " + num1);
        System.out.println("Second Number = " + num2);
    }


    public static void main(String[] args) {

        Swap obj1 = new Swap(10, 20);
        Swap obj2 = new Swap(0, 0);

        System.out.println("Before Swapping:");
        obj1.display();

        obj2.swapNumbers(obj1);

        System.out.println("After Swapping:");
        obj1.display();
    }
}