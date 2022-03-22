public class RemoteTest {
    public static void main(String[] args){
        ControlRemote remmote=new ControlRemote();
        light bulb=new light();
        musicSystem music=new musicSystem();
        remmote.setCom(new SwitchOn(bulb));
        remmote.buttonPress();
        remmote.setCom(new Soundon(music));
        remmote.buttonPress();
        remmote.setCom(new RadioOff(music));
        remmote.buttonPress();
    }
}