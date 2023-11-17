package pa.pythag;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import pa.pythag.Main;

public class MainTest {
    public MainTest(){
    }

    @Test
    public void testTriple(){
        assertTrue(Main.triple(13));
        assertFalse(Main.triple(42));
    }

}