package week5;

public class Alice extends Object {

    private Long height;

    private Long weight;

    public Alice(Long height, Long weight) {
        this.height = height;
        this.weight = weight;
    }
    public void drinkBeverage(){
        System.out.println("음료수를 마십니다. ");
    }

    private void setWeight(Long weight) {
        this.weight = weight;
    }

    private void setHeight(Long height) {
        this.height = height;
    }
}
