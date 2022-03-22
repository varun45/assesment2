public class SwitchOn implements remoteDesign {
    light bulb;
    public SwitchOn(light bulb){
        this.bulb=bulb;
    }
    public void run(){
        bulb.on();
    }
}