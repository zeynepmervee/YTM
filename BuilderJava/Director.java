
class Director {
    private ShapeBuilder builder;

    public Director(ShapeBuilder builder) {
        this.builder = builder;
    }

    public Shape constructShape() {
        builder.buildSides();
        builder.buildStartingPosition();
        builder.buildSideLength();
        builder.buildSideThickness();
        builder.buildBorderColor();
        builder.buildFillColor();
        return builder.getShape();
    }
}
