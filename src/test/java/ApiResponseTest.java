import com.bookinggo.assignment.ApiResponse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApiResponseTest {
    private ApiResponse testApi;


    @Before
    public void setup() {

        testApi= new ApiResponse();
    }

    @Test
    public void testSetSupplierId() {

        String supplierId = "testing";

        testApi.setSupplierId( supplierId );

        assertEquals ( supplierId, testApi.getSupplierId() );
    }

    @Test
    public void testSetPickup() {

        String pickup = "4.0, 5.0";
        testApi.setPickup( pickup );

        assertEquals( pickup, testApi.getPickup() );
    }

    @Test
    public void testSetDropoff() {

        String dropoff = "4.0, 5.0";
        testApi.setDropoff( dropoff );

        assertEquals( dropoff, testApi.getDropoff() );
    }

	@Test
	public void testSetOptions() {
		testApi.setRideOptions( null );

		assertEquals(null, testApi.getRideOptions() );
	}
}