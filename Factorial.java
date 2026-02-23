class Factorial {

    int num;

    Factorial(int n) {
        num = n;
    }

    int calculateFactorial() {
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        return fact;
    }


    public static void main(String[] args) {

        Factorial obj = new Factorial(5);

        int result = obj.calculateFactorial();

        System.out.println("Factorial = " + result);
    }
}