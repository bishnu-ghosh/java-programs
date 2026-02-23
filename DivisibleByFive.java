class DivisibleByFive {

    int num;

    DivisibleByFive(int n) {
        num = n;
    }

    void checkDivisible() {
        if (num % 5 == 0) {
            System.out.println(num + " is divisible by 5.");
        } else {
            System.out.println(num + " is not divisible by 5.");
        }
    }
    public static void main(String[] args) {

        DivisibleByFive obj = new DivisibleByFive(25);
        obj.checkDivisible();
    }
}