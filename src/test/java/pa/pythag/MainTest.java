package pa.pythag;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import pa.pythag.Main;

public class MainTest {
    public MainTest(){
    }

    @Test
    public void testTriple(){
        //Test if these values are true
        assertTrue(Main.triple(13));
        assertTrue(Main.triple(25));
        assertTrue(Main.triple(61));
        assertTrue(Main.triple(365));
        assertTrue(Main.triple(101));


        //Test if these values are false
        assertFalse(Main.triple(42));
        assertFalse(Main.triple(18));
        assertFalse(Main.triple(62));
        assertFalse(Main.triple(103));
        assertFalse(Main.triple(294));
    }

}