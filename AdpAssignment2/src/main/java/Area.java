import org.testng.Assert;
import org.testng.annotations.Test;


public class Area {
    int area(int l, int b) {
        return l * b;
    }

    @Test
    public void area() {
        Area calc = new Area();
        int result = calc.area(3, 3);
        Assert.assertEquals(25, result);

    }
}
