package abstractfactory.design.pattern;

public class Main {
    public static void main(String[] args) {

        // Create shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");

        //Call factory method on shape
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        Shape square = shapeFactory.getShape("square");
        square.draw();


        // Create color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");

        // Call factory method on color
        Color red = colorFactory.getColor("red");
        red.fill();

        Color blue = colorFactory.getColor("blue");
        blue.fill();

        Color green = colorFactory.getColor("green");
        green.fill();
    }
}
