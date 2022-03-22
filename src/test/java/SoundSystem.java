import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SoundSystemTest extends SoungSystem {

    @Test
    void testExecuteOn() {
        SoundSystemSystem st=new SoundSystem();
        st.executeOn();
    }

    @Test
    void testExecuteOff() {
        SoundSystem st=new SoundSystem();
        st.executeOff();
    }
}