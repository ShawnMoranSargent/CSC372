package CriticalThink;

public class Cone extends Shape{
    private final double radius;
    private final double height;
    
    public Cone(){
        this.radius = 1;
        this.height = 1;
    }
    
    public Cone(double rad,double hgt){
        this.radius = rad;
        this.height = hgt;
    }

    @Override
    double surface_area(){
        double radicand = Math.sqrt(radius* radius + height * height);
        return (pi * radius) * (radius + radicand) ;
    }
    @Override
    double volume(){
        return pi * radius * radius * (height /3);
    }
    @Override
    public String toString() {
        System.err.println("Cone");
        System.err.println("========");
        System.err.println("Radius: " + this.radius);
        System.err.println("Height: " + this.height);
        System.err.println("Surface Area: " + surface_area());
        System.err.println("Volume: " + volume());

        return "Cone";
    }
}
