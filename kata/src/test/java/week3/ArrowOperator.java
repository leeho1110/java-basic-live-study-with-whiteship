package week3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrowOperator {

    @DisplayName("화살표 연산자 사용 케이스")
    @Test
    public void arrowOperatorTest(){
        // IntegerMath.operation 구현
        IntegerMath addMath = new IntegerMath() {
            @Override
            public int operation(int leftNumber, int rightNumber) {
                return leftNumber + rightNumber;
            }
        };

        // IntegerMath.operation 구현
        IntegerMath addMath2 = (leftNumber, rightNumber) -> leftNumber + rightNumber;

        assertThat(addMath.operation(2,4)).isEqualTo(addMath2.operation(2,4));
    }

    @Test
    public void swi(){
        int numLetters = 0;
        Day day = Day.TUESDAY;
        switch (day) {
            case MONDAY:
            case FRIDAY:
            case SUNDAY: // fall through을 통해 다중 케이스를 매칭시키는 형태
                numLetters = 6;
                break;
            case TUESDAY:
                numLetters = 7;
                break;
            case THURSDAY:
            case SATURDAY:
                numLetters = 8;
                break;
            case WEDNESDAY:
                numLetters = 9;
                break;
            default:
                throw new IllegalStateException("Invalid day: " + day);
        }

        System.out.println(numLetters);
    }

    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, SATURDAY, FRIDAY, SUNDAY
    }

}
