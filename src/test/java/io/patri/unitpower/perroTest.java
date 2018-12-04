package io.patri.unitpower;

import org.testng.Assert;
import org.testng.annotations.Test;

public class perroTest {

    @Test
    public void saluda_nada_guau() {
        Perro sut = new Perro();
        String actual = sut.saluda();
        String expected ="guau";
        Assert.assertEquals(actual, expected);
    }
}
