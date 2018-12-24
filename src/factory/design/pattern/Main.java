package factory.design.pattern;

public class Main {
    public static void main(String[] args) {

        // Shape factory object
        ShapeFactory shapeFactory = new ShapeFactory();

        // Get different shapes using get shape
        
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();


        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        Shape triangle = shapeFactory.getShape("triangle");
        triangle.draw();
    }

}
