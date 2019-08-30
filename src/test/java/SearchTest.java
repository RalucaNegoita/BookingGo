
import com.bookinggo.assignment.Search;
import com.bookinggo.assignment.ApiResponse;
import com.bookinggo.assignment.CarType;

import static org.junit.Assert.assertEquals;

import java.net.URL;
import java.util.Map;

import org.junit.*;
import java.net.MalformedURLException;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;


public class SearchTest {

    private Search searchTest;
    private ApiResponse apiResponse;

    private Search search = new Search();
    private Map<String, CarType> testMap;

        @Before
        public void setUp() {

            searchTest = mock(Search.class);
            apiResponse = new ApiResponse();
        }

        @Test
        public void testMakeApiCallTrue() throws MalformedURLException, Exception {

            String trueUrl = "https://techtest.rideways.com/dave?pickup=2,2&dropoff=2,2";
            doReturn(apiResponse).when(searchTest).makeApiCall(new URL(trueUrl));
    }
        @Test
        public void testMakeApiCallFalse() throws Exception {

            String falseUrl = "https://techtest.rideways.com/dave?pickup=2,2";
            assertEquals(null, search.makeApiCall(new URL(falseUrl)) );
        }

        @Test
        public void testGetMap() throws MalformedURLException, Exception {
            doReturn(testMap).when(searchTest).getMap();
        }
    }
