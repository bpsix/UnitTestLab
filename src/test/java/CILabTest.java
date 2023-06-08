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
       myString.setString("abcdefghijklmnopqrstuvwxyz");
       boolean allCaps = myString.detectCapitalUse();
       assertFalse(allCaps);
    }

    //Only first letter capitalized case
    @Test
    public void detectCapitalUseTest2() {
        myString.setString("Apple");
        boolean allCaps = myString.detectCapitalUse();
        assertFalse(allCaps);
    }

    //All capital letters case
    @Test
    public void detectCapitalUseTest3() {
        myString.setString("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        boolean allCaps = myString.detectCapitalUse();
        assertTrue(allCaps);
    }

    //Contains non-letter characters case
    @Test
    public void detectCapitalUseTest4() {
        myString.setString("5%#$*#aaGJSAFGL7*%&(@(?");
        boolean allCaps = myString.detectCapitalUse();
        assertFalse(allCaps);
    }


}
