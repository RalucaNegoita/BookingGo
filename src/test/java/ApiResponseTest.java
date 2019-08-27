import com.bookinggo.assignment.ApiResponse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApiResponseTest {
    private ApiResponse testApi;

    private ApiResponse supplierId;
    private ApiResponse pickUp;
    private ApiResponse dropOff;

    @Before
    public void setup() {

        testApi= new ApiResponse();
    }

    @Test
    public void testSetSupplierId() {

        String id = "testID";
        testApi.setSupplierId( id );

        assertEquals ( id, testApi.getSupplierId() );
    }

    @Test
    public void testSetPickup() {

        String pickup = "4.0, 5.0";
        testApi.setPickup( pickup );

        assertEquals( pickup, testApi.setPickup() );
    }

    @Test
    public void testSetDropoff() {
        String dropoff = "4.0, 5.0";
        testApi.setDropOff( dropoff );;

        assertEquals( dropoff, testApi.getDropoff() );
    }


	@Test
	public void testSetOptions() {
		testApi.setOptions( null );

		assertEquals(null, testApi.getRideOptions() );
	}
}