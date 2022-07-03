package week6;

public interface IHuman {

    default void say(){
        System.out.println("Hi!");
    };
}
