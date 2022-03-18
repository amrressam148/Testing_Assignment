import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayInputStream;
public class TestYoungPhysicist  {
    @Test
    public void FIRST_TEST(){
        String data="4\n"+"2 5 2\n"+"2 -3 1\n"+"-6 -1 -4\n"+"2 -1 1";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(YoungPhysicist.youngPhysicist(),true);
    }
    @Test
    public void SECOND_TEST(){
        String data="4\n"+"-4 4 0\n"+"3 2 -5\n"+"8 7 -15\n"+"9 2 -11\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(YoungPhysicist.youngPhysicist(),false);
    }
    @Test
    public void THIRD_TEST(){
        String data="4\n"+"6 -3 -3\n"+"7 -4 -3\n"+"10 -7 -3\n"+"9 5 6\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(YoungPhysicist.youngPhysicist(),false);
    }

}