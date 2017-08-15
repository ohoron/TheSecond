import org.testng.annotations.*;

public class TestClass {
    @Test
    public void testMethod1 () {
        System.out.println("This is method 1");
    }
    @BeforeTest
    public void testMethod2 (){
        System.out.println("This is method 2");
    }
    @AfterTest
    public void testMethod3 (){
        System.out.println("This is method 22222");
    }

}
