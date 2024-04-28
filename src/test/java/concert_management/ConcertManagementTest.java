package concert_management;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConcertManagementTest {

    private ConcertManagement concertManagement;

    @Before
    public void setUp() {
        concertManagement = new ConcertManagement();
    }

    @Test
    public void testCreateAndRead() {
        concertManagement.create("example", "2024-04-24", "Athens", 50.00, "123");
        
        // Test create and read
        assertEquals(1, concertManagement.concertList.size()); 
        
    }

    @Test
    public void testFindConcertBySinger() {
        concertManagement.create("example", "2024-04-24", "Athens", 50.00, "123");
        concertManagement.create("example2", "2024-04-25", "Paris", 50.00, "123");

        // Test finding a concert by singer
        Concert foundConcert = concertManagement.findConcertBySinger("example2");
        assertNotNull(foundConcert);
        assertEquals("example2", foundConcert.getSinger());
        assertEquals("2024-04-25", foundConcert.getDate());
        assertEquals("Paris", foundConcert.getPlace());

        // Test for a concert that doesn't exist
        Concert nonExistentConcert = concertManagement.findConcertBySinger("non");
        assertNull(nonExistentConcert);
    }

    @Test
    public void testUpdate() {
        Concert concert = new Concert("example", "2024-04-24", "Athens", 50.00, "123");
        
        concertManagement.update(concert, "2024-04-26", "Patras", 40.00, "111");
        
        // Test if the concert was updated
        assertEquals("2024-04-26", concert.getDate());
        assertEquals("Patras", concert.getPlace());
        assertEquals(40.00, concert.getTicketPrice(), 0.001);
        assertEquals("111", concert.getContactNumber());
    }

    @Test
    public void testDelete() {
        Concert concert = new Concert("example", "2024-04-24", "Athens", 50.00, "123");
             
        concertManagement.delete(concert);
        
        // Test if the concert was deleted
        assertNull(concertManagement.findConcertBySinger("example"));
    }
}
