package week6;

public interface IMale extends IHuman {

    @Override
    default void say() {
        System.out.println("Hi! I'm male");
    }
}
