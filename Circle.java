public class Circle extends Shape {
    private double radius =1 ;

    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double Area(){

        return 2*3.14*this.radius;
    }
    public double Perimeter(){

        return this.radius*this.radius*3.14;
    }
    public String toString(){

        return "A Circle with radius=: "+this.radius+"which is a subclass of"+super.toString();
    }
}
