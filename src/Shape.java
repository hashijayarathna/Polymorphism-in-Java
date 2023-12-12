class Shape {
    void draw() {
        System.out.println("Drawing");
    }
}
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle!");
    }
}
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle!");
    }
}
class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Triangle!");
    }
}
class Test1 {
    public static void main(String[] args) {
        Shape s;
        s = new Circle();
        s.draw();
        s = new Rectangle();
        s.draw();
        s = new Triangle();
        s.draw();
    }
}
