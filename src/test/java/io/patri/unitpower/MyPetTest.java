package io.patri.unitpower;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyPetTest {

    private MyPet sut;
    private Gato gato;
    private Perro perro;

    @BeforeMethod
    public void setUp() {
        sut = new MyPet();
        gato = new Gato();
        perro = new Perro();
    }

    @Test
    public void dimeHola_gato_saludoGato() {

        String actual = sut.dimeHolaGato(gato);
        String expected = "Hola miau";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void dimeHola_perro_saludoPerro() {

        String actual = sut.dimeHolaPerro(perro);
        String expected = "Hola guau";
        Assert.assertEquals(actual, expected);
    }
}
