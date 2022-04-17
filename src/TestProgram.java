package src;

import org.junit.jupiter.api.Test;

class TestProgram {

  @Test
  void test() {
    GeometricObject[] shapes =
        {new Square(1), new Square(2), new Square(3), new Square(4), new Square(5)};

    for (GeometricObject shape : shapes) {
      Square square = (Square) shape;
      System.out.println("The area is " + square.getArea());
      square.howToColor();
    }
  }

}
