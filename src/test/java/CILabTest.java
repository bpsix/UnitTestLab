import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    //All lowercase characters case
    @Test
    public void detectCapitalUseTest1() {
       fail("Not yet implemented");

    }

    //Only first letter capitalized case
    @Test
    public void detectCapitalUseTest2() {
        fail("Not yet implemented");
    }

    //All capital letters case
    @Test
    public void detectCapitalUseTest3() {
        fail("TODO");
    }

    //Contains non-letter characters case
    @Test
    public void detectCapitalUseTest4() {
        fail("TODO");
    }


}
