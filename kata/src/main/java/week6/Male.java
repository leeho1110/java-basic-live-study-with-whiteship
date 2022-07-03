package week6;

public class Male extends Human {

    public Male() {}

    public Male(String param) {
        System.out.println("Male Constructor");
    }

    @Override
    void say(){
        System.out.println("Hi! I'm male");
    }
}
