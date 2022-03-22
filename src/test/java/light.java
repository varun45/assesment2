
import junit.framework.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class LightTest extends light {
    @Test
    void testExecuteOn() {
        light st=new light();
        st.executeOn();
    }
    @Test
    void testExecuteOff() {
        light st=new light();
        st.executeOff();
    }
}