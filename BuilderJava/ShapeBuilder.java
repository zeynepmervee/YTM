interface ShapeBuilder {
    void buildSides();
    void buildStartingPosition();
    void buildSideLength();
    void buildSideThickness();
    void buildBorderColor();
    void buildFillColor();
    Shape getShape();
}