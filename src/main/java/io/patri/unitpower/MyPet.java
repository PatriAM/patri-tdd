package io.patri.unitpower;

public class MyPet {
    public String dimeHola(IPet pet) {
        String saludo = (pet.saluda() == null) ? "" : pet.saluda();
        String textSaluda = "Hola " + pet.saluda();
        return textSaluda.trim();
    }
}
