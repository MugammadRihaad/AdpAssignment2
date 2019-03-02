import org.testng.Assert;
import org.testng.annotations.Test;

public class ArearServiceImpl implements AreaInterface {
    @Override
    public int area(int a, int b) {
        return a*b;
    }

    @Test
    public void add() {
       AreaInterface calc = new ArearServiceImpl();
        int result = calc.area(3,3);
        Assert.assertEquals( 25, result);
    }

}

