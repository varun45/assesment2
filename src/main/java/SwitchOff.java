public class SwitchOff implements remoteDesign {
    light bulb;
    public SwitchOff(light bulb){
        this.bulb=bulb;
    }
    public void run(){
        bulb.off();
    }
}