package src;

public class Square extends GeometricObject implements Colorable {
  private double side;

  public Square() {
    setSide(0);
  }

  public Square(double side) {
    this.setSide(side);
  }

  @Override
  public void howToColor() {
    System.out.println("Color all four sides");

  }

  public double getSide() {
    return side;
  }

  public void setSide(double side) {
    this.side = side;
  }

  public double getArea() {
    return side * side;
  }
}
