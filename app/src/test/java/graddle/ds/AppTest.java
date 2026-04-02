package graddle.ds;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testSearch() {
        LinkedList list = new LinkedList();
        list.insertAtBeginning(10);
        list.insertAtEnd(20);

        assertTrue(list.search(10));
        assertFalse(list.search(100));
    }
}