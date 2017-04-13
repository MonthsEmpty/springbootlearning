package aaa;

import com.vincent.spring4learn.CDPlayerConfig;
import com.vincent.spring4learn.CompactDisc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Administrator on 2017/4/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

//    public final Standardo

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotNull(){
        System.out.println(111);
        assertNotNull(cd);
    }


}
