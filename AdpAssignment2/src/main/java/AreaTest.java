import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AreaTest {
    private AreaInterface area;
    @BeforeMethod
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        area = (AreaInterface) ctx.getBean("area");
    }
    @AfterMethod
    public void tearDown() throws Exception {

    }    @Test
    public void testAdd() throws Exception {
        int result = area.area(5,5);
        Assert.assertEquals(result,10," area of length and breath 5 *5 is 25");    }
}
