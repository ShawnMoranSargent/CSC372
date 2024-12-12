package CriticalThink;

public class Cylinder extends Shape{
    private final double radius;
    private final double height;
    
    public Cylinder(){
        this.radius = 1;
        this.height = 1;
    }
    
    public Cylinder(double rad, double hgt){
        this.radius = rad;
        this.height = hgt;
    }

    @Override
    double surface_area(){
        double baseAreas = 2 * pi * radius * radius;
        double curvedArea = 2 * pi * radius * height;
        return baseAreas + curvedArea;
    }
    @Override
    double volume(){
        return pi * radius * radius * height;
    }
    @Override
    public String toString() {
        System.err.println("Cylinder");
        System.err.println("========");
        System.err.println("Radius: " + this.radius);
        System.err.println("Height: " + this.height);
        System.err.println("Surface Area: " + surface_area());
        System.err.println("Volume: " + volume());

        return "Cylinder";
    }
}
