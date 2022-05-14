package javastudy.week3;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class InstanceOfTest {

    @Test
    public void giveWhenInstanceIsOfSubtype_thenReturnTrue() {
        Circle circle = new Circle();
        assertThat(circle instanceof Round).isTrue();
    }

    @Test
    public void givenWhenTypeIsInterface_thenReturnTrue() {
        Circle circle = new Circle();
        assertThat(circle instanceof Shape).isTrue();
    }

    @Test
    public void givenWhenComparingClassInDiffHierarchy_thenCompilationError() {
        Circle circle = new Circle();
//        assertThat(circle instanceof Triangle).isFalse(); // java: incompatible types: java-study.basic.Circle cannot be converted to java-study.basic.Triangle
    }

    @Test
    public void givenWhenTypeIsOfObjectType_thenReturnTrue() {
        Thread thread = new Thread();
        assertThat(thread instanceof Object).isTrue();
    }
}
