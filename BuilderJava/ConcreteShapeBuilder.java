
class ConcreteShapeBuilder implements ShapeBuilder {
    private Shape shape;

    public ConcreteShapeBuilder() {
        this.shape = new Shape();
    }

    @Override
    public void buildSides() {
        shape.setSides(5); // Example: A pentagon
    }

    @Override
    public void buildStartingPosition() {
        shape.setStartingPosition("(0, 0)");
    }

    @Override
    public void buildSideLength() {
        shape.setSideLength(10);
    }

    @Override
    public void buildSideThickness() {
        shape.setSideThickness(2);
    }

    @Override
    public void buildBorderColor() {
        shape.setBorderColor("Red");
    }

    @Override
    public void buildFillColor() {
        shape.setFillColor("Blue");
    }

    @Override
    public Shape getShape() {
        return shape;
    }
}