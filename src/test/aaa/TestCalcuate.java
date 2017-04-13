package aaa;

import com.vincent.junitlearn.Calcuate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by dell on 2017/4/13.
 */
public class TestCalcuate {
    private Calcuate cal;

    @Before
    public void setUp(){
        cal = new Calcuate();
    }

    @Test
    public void testAdd(){
        int result = cal.add(12,22);
        Assert.assertEquals("加法有误",result,34);
    }

    @Test
    public void testMinus(){
        int result = cal.minus(20,10);
        Assert.assertEquals("minus is wrong",result,10);
    }
}
