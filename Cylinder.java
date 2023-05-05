public class Cylinder extends Circle {
    private double height;

    public Cylinder(){
        super();
        this.height = 4.0;
    }

    public Cylinder(double radius){
        super(radius);
        this.height = 4.0;
    }

    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;

    }

    public double getHeight(){
        return Math.round(this.height * 100.0) / 100.0;
    }

    public double getVolume(){
        return Math.round((super.getArea() * this.height) * 100.0) / 100.0;
    }

}
