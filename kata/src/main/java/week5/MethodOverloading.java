package week5;

public class MethodOverloading {

    // Available case
    public void method(String param) {}
    public void method(String param, String param2) {}
    public void method(int param, String param2) {}

    // Fail Case #1
    // compiler cannot distinguish
    //'sameMethod(String)' is already defined in 'week5.MethodOverloading'
//    public void sameMethod(String param) {}
//    public void sameMethod(String param) {}

    // Fail Case #2
    // 'diffReturnType(String)' clashes with 'diffReturnType(String)'; both methods have same erasure
//    public void diffReturnType(String param) {}
//    public String diffReturnType(String param) {}
}
