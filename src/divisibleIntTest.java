import org.junit.Assert;

public class divisibleIntTest {
    divisibleInt integer = new divisibleInt();
    int testNum = 10;

    @org.junit.Test
    public void divideAnd() throws Exception {
        Assert.assertEquals("Expected result = false", false, integer.divideAnd(testNum));
    }
    @org.junit.Test
    public void divideOr() throws Exception {
        Assert.assertEquals("Expected result = true", true, integer.divideOr(testNum));
    }
    @org.junit.Test
    public void divideBoth() throws Exception {
        Assert.assertEquals("Expected result = true", true, integer.divideBoth(testNum));
    }
}