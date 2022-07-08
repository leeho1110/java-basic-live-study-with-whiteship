package week6.finalKeyword;

public class FinalReference {

    private final Car car;

    public FinalReference(Car car) {
        this.car = car;
    }

    public void sayMyCar(){
        System.out.println("car's name = " + car.getName());
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.setName("sonata");

        FinalReference finalRef = new FinalReference(car);
        finalRef.sayMyCar();

        car.setName("sorento");
        finalRef.sayMyCar();
    }
}
