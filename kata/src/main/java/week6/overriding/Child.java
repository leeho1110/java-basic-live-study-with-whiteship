package week6.overriding;

public class Child extends Parent {

    @Override
    protected void method(){ // java: method() in week6.overriding.Child cannot override method() in week6.overriding.Parent attempting to assign weaker access privileges; was protected
        System.out.println();
    }

//    @Override
//    void finalMethod(){} // 'finalMethod()' cannot override 'finalMethod()' in 'week6.overriding.Parent'; overridden method is final

//    @Override
//    void staticMethod(); // Method does not override method from its superclass

//    static void nonstaticMethod() {}; // Static method 'nonstaticMethod()' in 'week6.overriding.Child' cannot override instance method 'nonstaticMethod()' in 'week6.overriding.Parent'
}
