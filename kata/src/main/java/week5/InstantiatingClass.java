package week5;

import java.awt.*;

public class InstantiatingClass {

    public static void main(String[] args) {

        // 참조 변수 생성
        Alice alice = new Alice(170L,  60L);
        System.out.println("alice = " + alice); // alice = week5.Alice@3796751b

        // 표현식 사용
        new Alice(165L, 55L).drinkBeverage(); // 음료수를 마십니다.

        // Variable 'point' might not have been initialized
        Point point;
//        System.out.println(point.x);

    }
}
