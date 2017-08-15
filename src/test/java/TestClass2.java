import org.testng.annotations.*;

public class TestClass2 {
    @Test
    public void testMethod3 (){
        System.out.println("This is method 3");
    }
    @BeforeTest
    public void testMethod4 (){
        System.out.println("This is method 4");
    }

}
