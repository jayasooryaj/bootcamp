package designpatterns;

import java.util.ArrayList;
import java.util.List;

public class ObserverDesign {
    public static void main(String arg[]){
        Channel myChannel = new Channel();
        Subscriber s1 = new Subscriber("Jayasoorya");
        Subscriber s2 = new Subscriber("Jithendra");
        Subscriber s3 = new Subscriber("Janaki");
        Subscriber s4 = new Subscriber("Keerthi");

        myChannel.subscribe(s1);
        myChannel.subscribe(s2);
        myChannel.subscribe(s3);
        myChannel.subscribe(s4);

        s1.channelSubscribed(myChannel);
        s2.channelSubscribed(myChannel);
        s3.channelSubscribed(myChannel);
        s4.channelSubscribed(myChannel);

        myChannel.upload("My First Video");

    }
}

class Subscriber{
    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(){
        System.out.println(this.name + " : " + channel.getTitle() + " uploaded a video");
    }

    public  void channelSubscribed(Channel ch){
        channel = ch;
    }
}
class Channel{
    private List<Subscriber> subs = new ArrayList<>();
    private String title;

    public String getTitle() {
        return title;
    }

    public void subscribe(Subscriber sub){
        subs.add(sub);
    }
    public void unSubscribe(Subscriber sub){
        subs.remove(sub);
    }

    public void notifySubscribers(){
        for(Subscriber sub: subs){
            sub.update();
        }
    }

    public void upload(String title){
        this.title = title;
        notifySubscribers();
    }

}