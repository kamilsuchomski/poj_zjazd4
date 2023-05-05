public class TestCircleAndCylinder {

    public static void main(String[] args) {

        Circle circleObj1 = new Circle();
        Circle circleObj2 = new Circle(15.81);

        System.out.println("circleObj1() getRadius(): " + circleObj1.getRadius());
        System.out.println("circleObj1() getArea(): " + circleObj1.getArea());
        System.out.println(circleObj1);

        System.out.println("circleObj2(double radius) getRadius(): " + circleObj2.getRadius());
        System.out.println("circleObj2(double radius) getArea(): " + circleObj2.getArea());
        System.out.println(circleObj2);

        Cylinder cylinderObj1 = new Cylinder();
        Cylinder cylinderObj2 = new Cylinder(7.48);
        Cylinder cylinderObj3 = new Cylinder(13.765, 32.95);

        System.out.println("cylinderObj1() getRadius(), getArea(): " + cylinderObj1.getRadius() + ", " + cylinderObj1.getArea());
        System.out.println("cylinderObj1() getHeight(), getVolume(): " + cylinderObj1.getHeight() + ", " + cylinderObj1.getVolume());
        System.out.println(cylinderObj1);

        System.out.println("cylinderObj2(radius) getRadius(), getArea(): " + cylinderObj2.getRadius() + ", " + cylinderObj2.getArea());
        System.out.println("cylinderObj2(radius) getHeight(), getVolume(): " + cylinderObj2.getHeight() + ", " + cylinderObj2.getVolume());
        System.out.println(cylinderObj2);

        System.out.println("cylinderObj3(radius, height) getRadius(), getArea(): " + cylinderObj3.getRadius() + ", " + cylinderObj3.getArea());
        System.out.println("cylinderObj3(radius, height) getHeight(), getVolume(): " + cylinderObj3.getHeight() + ", " + cylinderObj3.getVolume());
        System.out.println(cylinderObj3);

    }
}
