import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class mainTest {
    @Test
    public void multiplyTest(){
        int a  = 1;
        int b = 1;
        int res = a*b;
        assertEquals(main.multiply(a,b),res);
    }

}
