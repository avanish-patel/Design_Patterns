package abstractfactory.design.pattern;

public class FactoryProducer {

    public static AbstractFactory getFactory(String factoryName) {

        if (factoryName == null) {
            return null;
        }

        if (factoryName.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        } else if (factoryName.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }
        return null;
    }
}
