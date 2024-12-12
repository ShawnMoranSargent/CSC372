package CriticalThink;

public class Sphere extends Shape{
    private final double radius;
    
    public Sphere(){
        this.radius = 1;
    }
    
    public Sphere(double rad){
        this.radius = rad;
    }

    @Override
    double surface_area(){
        return 4 * pi * radius * radius;
    }
    @Override
    double volume(){
        return pi * radius * radius * radius * (4/3);
    }
    @Override
    public String toString() {
        System.err.println("Sphere");
        System.err.println("========");
        System.err.println("Radius: " + this.radius);
        System.err.println("Surface Area: " + surface_area());
        System.err.println("Volume: " + volume());

        return "Sphere";
    }
}
