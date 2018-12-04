package io.patri.unitpower;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyPetTest {

    @Test
    public void dimeHola_gato_saludoGato() {

        MyPet sut = new MyPet();
        Gato gato = new Gato();

        String actual = sut.dimeHolaGato(gato);
        String expected = "Hola miau";

        Assert.assertEquals(actual, expected);
    }
}
