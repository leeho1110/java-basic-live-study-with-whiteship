package week4;

public class SwitchDemo {
    public static void main(String[] args) {
        int number = 3;

        String numberString;
        switch (number) {
            case 1:  numberString = "one";
            case 2:  numberString = "two";
            case 3:  numberString = "three";
            default: numberString = "zero?";
        }
        System.out.println(numberString); // three
    }
}