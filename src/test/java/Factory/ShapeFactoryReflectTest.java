package Factory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.InvocationTargetException;

import org.junit.Before;
import org.junit.Test;

import Decorateur.Shapes.Circle;
import Decorateur.Shapes.Shape;
import Factory.Shape.ShapeFactoryReflect;
import Utils.OutStream;

public class ShapeFactoryReflectTest extends OutStream {
  ShapeFactoryReflect shapeFactory = null;

  @Before
  public void initShape() {
    shapeFactory =  ShapeFactoryReflect.getInstance();
  }

  @Test
  public void circleTest() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
      InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
  
    // get an object of Circle and call its draw method.
    Shape shape1 = shapeFactory.getShape("Circle");

    // // call draw method of Circle
    assertTrue(shape1 instanceof Circle);
    assertTrue(shape1 instanceof Shape);

    shape1.draw();
    assertEquals("Shape: Circle"+System.lineSeparator(), getOutput());
  }

  @Test
  public void rectangleTest() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
      InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

    // get an object of Rectangle and call its draw method.
    Shape shape2 = shapeFactory.getShape("Decorateur.Shapes.Rectangle");

    // call draw method of Rectangle
    shape2.draw();
    // assertEquals("Shape: Circle"+System.lineSeparator(), getOutput());
 
  }

  @Test
  public void squareTest() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
      InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
    // get an object of Square and call its draw method.
    Shape shape3 = shapeFactory.getShape("Decorateur.Shapes.Square");

    // call draw method of square
    shape3.draw();
    // assertEquals("Inside Square::draw() method."+System.lineSeparator(), getOutput());

  }
}