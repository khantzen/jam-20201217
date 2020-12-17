package fr.noether.jam20201217;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSum {

    @Test
    void myTest() {
        Assertions.assertThat(Sum.compute(3, 5)).isEqualTo(8);
    }
}
