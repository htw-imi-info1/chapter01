

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CircleTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CircleTest
{
    private Circle circle1;
    private Circle circle2;
    private Circle circle3;
    private Circle circle22;

    /**
     * Default constructor for test class CircleTest
     */
    public CircleTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        circle1 = new Circle();
        circle2 = new Circle();
        circle2.moveLeft();
        circle2.changeColor("red");
        Circle circle2 = new Circle();;
        Circle circle3 = new Circle();;
        circle3.changeColor("green");;
        circle3.moveRight();;
        circle3.moveRight();;
        circle3.moveRight();;
        circle3.moveRight();;
        circle3.moveRight();;
        circle3.moveRight();;
        circle1.makeInvisible();
        circle1.moveDown();
        circle1.makeInvisible();
        circle1.makeVisible();
        circle1.moveDown();
        circle3 = circle3;
        circle22 = circle2;
        circle22.changeColor("magenta");
        circle2.changeColor("yellow");
      
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
