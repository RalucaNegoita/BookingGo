import com.bookinggo.assignment.RideOption;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RideOptionTest {

    RideOption option;

    @Before
    public void setup()
    {
        option = new RideOption();
    }


    @Test
    public void testSetCarType(){

        String testCarType = "anyCar";
        option.setCarType( testCarType );
        assertEquals( " Cars are the same type ", testCarType, option.getCarType() );
    }


    @Test
    public void testSetPrice(){

        int price = 10;
        option.setPrice( price );
        assertEquals( "The price is the same ", price, option.getPrice() );
    }

}
