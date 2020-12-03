package core.basesyntax.figures;

public class Square extends Shape {
    private double side;

    public Square(int value, String color) {
        super(color);
        this.side = value;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public void draw() {
        System.out.format("Figure: square, perimeter: %.2f"
                        + ", area: %.2f"
                        + " sq. units, side: %.2f", getPerimeter(), getArea(), getSide());
        System.out.format(" units, diagonal: %.2f"
                        + " units, color: %s.%n", getDiagonal(), getColor());

    }

    public double getSide() {
        return side;
    }

    public double getDiagonal() {
        return side;
    }
}
