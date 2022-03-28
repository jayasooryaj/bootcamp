package designpatterns;

public class TemplateMethod {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();

        System.out.println();

        game = new Football();
        game.play();
    }
}

abstract class Game{
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    public final void play(){
        initialize();
        startPlay();
        endPlay();;
    }
}

class Cricket extends Game{

    @Override
    void initialize() {
        System.out.println("Cricket Initialized");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Started");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket game ended");
    }
}
class Football extends Game{

    @Override
    void initialize() {
        System.out.println("Football Initialized");
    }

    @Override
    void startPlay() {
        System.out.println("Football Started");
    }

    @Override
    void endPlay() {
        System.out.println("Football game ended");
    }
}