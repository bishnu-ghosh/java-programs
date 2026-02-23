class NumberCheck {
    int num;   
    
    NumberCheck(int n) {
        num = n;
    }

    void checkNumber() {
        if (num > 0) {
            System.out.println("The number is Positive.");
        } 
        else if (num < 0) {
            System.out.println("The number is Negative.");
        } 
        else {
            System.out.println("The number is Zero.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        NumberCheck obj = new NumberCheck(-10);
        obj.checkNumber();
    }
}