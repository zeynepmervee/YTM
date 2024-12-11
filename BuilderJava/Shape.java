
class Shape {
    private int sides;
    private String startingPosition;
    private int sideLength;
    private int sideThickness;
    private String borderColor;
    private String fillColor;

    public void setSides(int sides) {
        this.sides = sides;
    }

    public void setStartingPosition(String startingPosition) {
        this.startingPosition = startingPosition;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    public void setSideThickness(int sideThickness) {
        this.sideThickness = sideThickness;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }


    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    @Override
    public String toString() {
        return "Shape Details:\n" +
                "Number of Sides: " + sides + '\n' +
                "Starting Position: " + startingPosition + '\n' +
                "Side Length: " + sideLength + '\n' +
                "Side Thickness: " + sideThickness + '\n' +
                "Border Color: " + borderColor + '\n' +
                "Fill Color: " + fillColor;
    }
}