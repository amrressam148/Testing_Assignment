import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayInputStream;


public class TestWatermelon {
    @Test
    public void FIRST_TEST(){
        String data="2";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(Watermelon.watermelon(),false);
    }
    @Test
    public void SECOND_TEST(){
        String data="80";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(Watermelon.watermelon(),true);
    }
    @Test
    public void THIRD_TEST(){
        String data="50";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(Watermelon.watermelon(),true);
    }
    @Test
    public void FOURTH_TEST(){
        String data="67";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(Watermelon.watermelon(),false);
    }

}