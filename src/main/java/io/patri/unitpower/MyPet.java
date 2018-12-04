package io.patri.unitpower;

public class MyPet {
    public String dimeHolaGato(Gato gato) {
        return "Hola " +gato.saluda();
    }

    public String dimeHolaPerro(Perro perro) {
        return "Hola " +perro.saluda();
    }
}
