package core.basesyntax.figures;

import core.basesyntax.FigureProducer;

public class RightTriangle extends Shape implements Drawable {
    private double legA;
    private double legB;

    public RightTriangle(int value1, int value2) {
        super(FigureProducer.generateColor());
        this.legA = value1;
        this.legB = value2;
    }

    @Override
    public double getArea() {
        double s = (legA + legB + getHypotenuse()) / 2; // Heron
        return Math.sqrt(s * (s - legA) * (s - legB) * (s - getHypotenuse()));
    }

    @Override
    public double getPerimeter() {
        return legA + legB + getHypotenuse();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void draw() {
        System.out.format("Figure: right triangle, perimeter: %.2f"
                        + ", area: %.2f"
                        + " sq. units, legA: %.2f", getPerimeter(), getArea(), getLegA());
        System.out.format(" units, legB: %.2f"
                        + " units, hypotenuse: %.2f"
                        + " units, color: %s.%n", getLegB(), getHypotenuse(), getColor());
    }

    public double getLegA() {
        return legA;
    }

    public double getLegB() {
        return legB;
    }

    public double getHypotenuse() {
        return Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2));
    }
}
