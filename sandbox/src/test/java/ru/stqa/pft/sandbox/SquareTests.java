package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;



public class SquareTests {

 @Test
  public void testArea() {
   System.out.println();
  Square s = new Square(5);

Assert.assertEquals(s.area(),25.0);
  }

}
