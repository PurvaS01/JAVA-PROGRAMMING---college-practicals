class Calculate {
    void area(int side) {
        System.out.println("Area of square = " + (side * side));
    }

    void area(int length, int breadth) {
        System.out.println("Area of rectangle = " + (length * breadth));
    }

    void area(double radius) {
        System.out.println("Area of circle = " + (3.14 * radius * radius));
    }
}

class Main {
    public static void main(String[] args) {
        Calculate a = new Calculate();
        a.area(5);
        a.area(10, 20);
        a.area(7.0);
    }
}
