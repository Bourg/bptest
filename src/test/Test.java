package test;

import edu.umd.rice.suite.Grain;
import edu.umd.rice.suite.Suite;
import me.bourg.bptest.Main;

public class Test extends Suite {
    @Grain
    public void testNothing() {
        assertEquals(Main.doFizzBuzz(15), "FizzBuzz");
    }
}
