package io.patri.unitpower;

import org.testng.annotations.Test;
import org.testng.Assert;

public class gatoTest {

    @Test
    public void saluda_nada_miau() {
        Gato sut = new Gato();

        String actual = sut.saluda();
        String expected = "miau";
        Assert.assertEquals(actual, expected);
    }
}
