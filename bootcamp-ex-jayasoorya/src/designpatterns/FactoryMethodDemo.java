package designpatterns;

interface OS{
    void spec();
}

class AndroidOS implements OS{
    public void spec(){
        System.out.println("Android");
    }
}

class iOS implements OS{
    public void spec(){
        System.out.println("iOS");
    }
}

class Windows implements OS{
    public void spec(){
        System.out.println("Windows");
    }
}

class OSFactory{
    public OS getInstance(String str){
        if(str.equals("Old")){
            return new Windows();
        }else if(str.equals("Smooth")){
            return new iOS();
        }else{
            return new AndroidOS();
        }
    }
}

public class FactoryMethodDemo {
    public static void main(String arg[]){
        OSFactory osFactory = new OSFactory();
        OS os = osFactory.getInstance("Smooth");
        os.spec();
    }

}
