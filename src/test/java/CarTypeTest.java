
import com.bookinggo.assignment.CarType;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CarTypeTest {

    private CarType testCar;

    private String carType;
    private int price;
    private String supplier;

    @Before
    public void setUp() {

        carType = "EXECUTIVE";
        price = 10;
        supplier = "testSupplier";
        testCar = new CarType( carType, price, supplier );
    }

    @Test
    public void testGetPassangers() {
        assertEquals(4, testCar.getPassangers() );
    }

    @Test
    public void testGetPrice() {
        assertEquals( price, testCar.getPrice() );
    }

    @Test
    public void testGetRideType() {
        assertEquals( carType, testCar.getRideType() );
    }

    @Test
    public void testGetSupplier() {
        assertEquals( supplier, testCar.getSupplier() );
    }
}