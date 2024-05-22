package concert_management; 

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.Mockito.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class MainTest {

    private InputStream originalSystemIn;

    @BeforeEach
    void setUp() {
        // Store the original System.in and reset it before each test
        originalSystemIn = System.in;
    }

    @Test
    void testMain() {
        // Prepare mock input
        String input = "C\nJohn\n2024-05-01\nVenue\n50.0\n123456789\nE\n";
        try (ByteArrayInputStream mockInput = new ByteArrayInputStream(input.getBytes())) {
            // Set mock input
            System.setIn(mockInput);

            // Mock ConcertManagement object
            ConcertManagement concertManagement = mock(ConcertManagement.class);

            // Run main method
            Main.main(new String[]{});

            // Verify that create method of ConcertManagement is called with correct parameters
            verify(concertManagement).create("John", "2024-05-01", "Venue", 50.0, "123456789");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Restore original System.in
            System.setIn(originalSystemIn);
        }
    }
}
