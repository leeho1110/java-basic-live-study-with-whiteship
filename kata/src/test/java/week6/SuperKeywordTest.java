package week6;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SuperKeywordTest {

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

    @Test
    public void test_superKeyword(){
        // given
        Leeho sut = new Leeho();

        // when
        sut.say();

        // then
        assertThat("Hi! I'm male").isEqualTo(outputStreamCaptor.toString().trim());
    }

    @DisplayName("자식 클래스의 인스턴스가 생성될 때 부모 클래스의 인스턴스가 먼저 생성되는가")
    @Test
    public void test_when_subclass_is_loaded_superclass_constructor_is_loaded_first(){
        // given
        Leeho sut = new Leeho();

        // when
        sut.say();

        // then
        assertThat("Male Constructor\nHi! I'm male").isEqualTo(outputStreamCaptor.toString().trim());
    }



}
