public class Soundon implements remoteDesign{
    musicSystem music;
    public Soundon(musicSystem music){
        this.music=music;
    }
    public void run(){
        music.on();
        music.setCD();
        music.setVolume(15);
    }
}