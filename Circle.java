public class Circle {
    public double radius;
    public String color;

    public Circle(){
        this.radius = 1.0;
        this.color = "blue";
    }

    public Circle(double radius){
        this.radius = radius;
        this.color = "blue";
    }

    public double getRadius(){
        return Math.round(this.radius * 100.0) / 100.0;
    }

    public double getArea(){
        return Math.round((Math.pow((Math.PI * radius), 2)) * 100.0) / 100.0;
    }

    @Override
    public String toString(){
        return "Circle radius = " + this.radius + " color = " + this.color;
    }
}
