package week4;

public class SeoulBike {

    private int currentSpeed;

    public void applyBreak(){
        if(isMoving()){
            this.currentSpeed--;
        }
    }

    private boolean isMoving() {
        return currentSpeed > 0;
    }
}
