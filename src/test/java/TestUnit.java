import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.assertEquals;

public class TestUnit {
    @Test//(expected = RuntimeException.class)
    public void testfunc() {
        Kot newkot = new Kot("msd");
        //throw new RuntimeException();
        assertEquals(newkot.number, countMurr(newkot.murrcount()));
    }

    private int countMurr(String catSay) {
        return  catSay.length() / 5;
    }
}
