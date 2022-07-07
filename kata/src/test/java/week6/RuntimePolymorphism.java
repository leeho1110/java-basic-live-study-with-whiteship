package week6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class RuntimePolymorphism {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @DisplayName("변수 타입이 부모클래스지만, 참조되는 객체가 자식클래스라면 오버라이딩된 메서드를 호출하는가")
    @Test
    public void test_when_refObj_is_child_then_return_child_method(){
        // given
        Human sut = new Male();

        // when
        sut.say();

        // then
        assertThat("Hi! I'm male").isEqualTo(outputStreamCaptor.toString().trim());
    }
}
