package week6;

public interface ILeeho extends IMale, IFemale {

    @Override
    default void say() {
        IMale.super.say();
    }
}


