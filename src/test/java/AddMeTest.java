import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AddMeTest {

    App app = new App();

    @Test
    public void testAddMe() {
        assertEquals(5, app.addMe(2, 3), 0);
    }
    @Test
    public void testSubMe() {
        assertEquals(1, app.subMe(3, 2), 0);
    }
}
