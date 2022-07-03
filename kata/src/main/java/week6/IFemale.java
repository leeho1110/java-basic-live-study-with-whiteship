package week6;

public interface IFemale extends IHuman{

    @Override
    default void say(){
        System.out.println("Hi! I'm female");
    }

}
