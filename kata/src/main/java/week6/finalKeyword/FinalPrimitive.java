package week6.finalKeyword;

public class FinalPrimitive {

    final int finalData = 1;

    void doSomething(final int param){
        final int someVal;
        someVal = param;
        // someVal = 2; // Variable 'someVal' might already have been assigned to
    }

    public static void main(String[] args) {
        FinalPrimitive aFinal = new FinalPrimitive();
        aFinal.doSomething(1);

        // aFinal.finalData = 2; // cannot assign a value to final variable finalData
    }
}
