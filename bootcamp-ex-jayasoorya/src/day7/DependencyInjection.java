package day7;

public class DependencyInjection {
    public class Car {
        private Engine engine;
        public Car(Engine e) {
            engine = e;
        }
        public void start() {
            engine.start();
        }
    }
    public class Engine {
        public void start() {...}
    }
//    Here class car depends on clss engine . If there is a need to add a new type engine, it will
//    need refactoring of class Car. Instead what can be done is we can use an interface for Engine

    public interface Engine {
        public void start();
    }

    public class Car {
        private Engine engine = new DieselEngine();
        public Car(Engine e) {
            engine = e;
        }
        public void start() {
            engine.start();
        }
    }
    public class PetrolEngine implements Engine {
        public void start() {...}
    }
    public class DieselEngine implements Engine {
        public void start() {...}
    }


}
