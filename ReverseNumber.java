class ReverseNumber {

    int num;

    ReverseNumber(int n) {
        num = n;
    }

    void reverse() {
        int reverse = 0;
        int temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        System.out.println("Reversed Number = " + reverse);
    }


    public static void main(String[] args) {

        ReverseNumber obj = new ReverseNumber(1234);
        obj.reverse();
    }
}