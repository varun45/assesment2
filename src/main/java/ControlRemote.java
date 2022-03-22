public class ControlRemote {
    remoteDesign rem;
    public ControlRemote(){
    }
    public void setCom(remoteDesign remote){
        rem=remote;
    }
    public void buttonPress(){
        rem.run();
    }
}