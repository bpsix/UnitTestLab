import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

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

    //Null string case
    @Test
    public void setStringTest1() {
        fail("TODO");
    }

    //Average string case
    @Test
    public void setStringTest2() {
        fail("TODO");
    }

    //Null string case
    @Test
    public void getStringTest1() {
        fail("TODO");
    }

    //Average string case
    @Test
    public void getStringTest2() {
        fail("TODO");
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
