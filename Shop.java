class Shop {
    void area() {
        System.out.println("Calculating Area");
    }
}

class Square extends Shop {
    int side = 4;

    void area() {
        System.out.println("Area of Square = " + (side * side));
    }
}

class rectangle extends Shop {
    int length = 5, breadth = 3;

    void area() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
}

class Circle extends Shop {
    double radius = 2;

    void area() {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }

    public static void main(String[] args) {
        Square s = new Square();
        rectangle r = new rectangle();
        Circle c = new Circle();

        s.area();
        r.area();
        c.area();
    }
}