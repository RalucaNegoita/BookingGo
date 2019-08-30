import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.bookinggo.assignment.Part1;
import org.junit.Test;

public class Part1Test {

    @Test
    public void testCheckDoubleIsTrue() {
        assertTrue(Part1.checkDouble("2.0"));
    }

    @Test
    public void testCheckDoubleIsFalse() {
        assertFalse(Part1.checkDouble("false"));
    }

    @Test
    public void testFewArguments() {
        String[] testStr = new String[1];
        assertFalse(Part1.validArguments( testStr ));
    }

    @Test
    public void testFalseNrOfPassangerArgument() {

        String[] testStr = new String[5];
        testStr[4] = "0";
        assertFalse( Part1.validArguments( testStr ) );
    }

    @Test
    public void testFalseCoordinateArgument() {

        String[] testStr = new String[4];
        testStr[0] = "testStr";
        assertFalse(Part1.validArguments( testStr ));
    }

    @Test
    public void testValidArguments() {
        String[] testStr = new String[4];
        testStr[0] = "1";
        testStr[1] = "1";
        testStr[2] = "1";
        testStr[3] = "1";
        assertTrue(Part1.validArguments( testStr ));
    }

    @Test
    public void testConstructUrl() {
        String testUrl = "https://techtest.rideways.com/test/?pickup=1.0,1.0&dropoff=1.0,1.0";
        String[] testStr = new String[4];
        testStr[0] = "1";
        testStr[1] = "1";
        testStr[2] = "1";
        testStr[3] = "1";

        assertEquals( testUrl, Part1.constructURL( testStr, "test" ) );
    }
}