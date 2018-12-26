import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.AssertEquals.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayCollectionTest {
    @Test
    public void testsizeZero(){
        ArrayCollection ArrayA = new ArrayCollection();
        assertEquals(0,ArrayA.size());
    }
}
