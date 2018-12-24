package factory.design.pattern;

public class ShapeFactory {

    public Shape getShape(String shapeName) {

        if (shapeName == null) {
            return null;
        }

        if (shapeName.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeName.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeName.equalsIgnoreCase("TRIANGLE")) {
            return new Triangle();
        }
        return null;
    }
}
