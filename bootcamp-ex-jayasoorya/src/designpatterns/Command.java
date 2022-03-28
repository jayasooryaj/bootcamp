package designpatterns;

public class Command {
    public static void main(String arg[]){
        RemoteControl remote = new RemoteControl();
        SetTopBox setTopBox = new SetTopBox();
        Tv tv = new Tv();

        remote.setCommand(new SetTopBoxOnCommand(setTopBox));
        remote.pressButton();

        remote.setCommand(new TvOnCommand(tv));
        remote.pressButton();
        
        remote.setCommand(new SetTopBoxOFFCommand(setTopBox));
        remote.pressButton();

        remote.setCommand(new TvOffCommand(tv));
        remote.pressButton();
    }
}

interface CommandControl{
    public void execute();
}

class SetTopBox{
    public void on(){
        System.out.println("SetTopBox is ON");
    }
    public void off(){
        System.out.println("SetTopBox is OFF");
    }
    public void setChannel(int channel){
        System.out.println("Channel set to : " + channel);
    }
    public void setVolume(int volume){
        System.out.println("Volume set to : " + volume);
    }
}
class Tv {
    public void on(){
        System.out.println("TV is on");
    }
    public void off(){
        System.out.println("TV is off");
    }
}

class SetTopBoxOnCommand implements CommandControl{

    SetTopBox setTopBox;
    public SetTopBoxOnCommand(SetTopBox setTopBox){
        this.setTopBox = setTopBox;
    }

    @Override
    public void execute() {

        setTopBox.on();
        setTopBox.setChannel(10);
        setTopBox.setVolume(15);

    }
}
class SetTopBoxOFFCommand implements  CommandControl{
    SetTopBox setTopBox;

    public SetTopBoxOFFCommand(SetTopBox setTopBox) {
        this.setTopBox = setTopBox;
    }

    @Override
    public void execute() {
        setTopBox.off();
    }
}

class TvOffCommand implements CommandControl{

    Tv tv;

    public TvOffCommand(Tv tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }
}
class TvOnCommand implements CommandControl{

    Tv tv;

    public TvOnCommand(Tv tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }
}

class RemoteControl {
    CommandControl command;

    public void setCommand(CommandControl command) {
        this.command = command;
    }
    public void pressButton(){
        command.execute();
    }
}
