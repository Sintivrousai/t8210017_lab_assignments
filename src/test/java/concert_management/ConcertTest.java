package concert_management;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ConcertTest {
    @Test
    public void testGettersAndSetters() {
        Concert concert = new Concert("example", "2024-04-24", "Athens", 50, "123");
        
        // Test getters
        assertEquals("example", concert.getSinger());
        assertEquals("2024-04-24", concert.getDate());
        assertEquals("Athens", concert.getPlace());
        assertEquals(50, concert.getTicketPrice(), 0.001); 
        assertEquals("123", concert.getContactNumber());
        
        // Test setters
        concert.setSinger("example2");
        concert.setDate("2024-04-25");
        concert.setPlace("Paris");
        concert.setTicketPrice(75.30);
        concert.setContactNumber("987");
        
        assertEquals("example2", concert.getSinger());
        assertEquals("2024-04-25", concert.getDate());
        assertEquals("Paris", concert.getPlace());
        assertEquals(75.30, concert.getTicketPrice(), 0.001);
        assertEquals("987", concert.getContactNumber());
    }
    
}
