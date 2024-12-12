package CriticalThink;

public class ShapeArray {
    public static void main(String[] args) {
        Sphere TheSphere = new Sphere(3);
        Cylinder TheCylinder = new Cylinder(2,3);
        Cone TheCone = new Cone(2,3);
        Shape[] shapeArray = {TheSphere, TheCylinder, TheCone};
        
        for (int index = 0; index < shapeArray.length; index++) {
            System.err.println("");
            shapeArray[index].toString();
            System.err.println("");
        }
    }
}
