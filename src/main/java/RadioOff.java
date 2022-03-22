public class RadioOff implements remoteDesign{
    musicSystem music;
    public RadioOff(musicSystem music){
        this.music=music;
    }
    public void run(){
        music.off();
    }
}