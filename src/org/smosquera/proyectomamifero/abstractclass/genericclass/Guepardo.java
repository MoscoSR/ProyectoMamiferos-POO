package org.smosquera.proyectomamifero.abstractclass.genericclass;

import org.smosquera.proyectomamifero.abstractclass.Felino;

public class Guepardo extends Felino {
    public Guepardo(float tamanoGarras, int velocidad, String habitat, float altura, float largo, float peso, String nombreCientifico) {
        super(tamanoGarras, velocidad, habitat, altura, largo, peso, nombreCientifico);
    }

    @Override
    public String comer() {
        return "El guerpado come con su manada";
    }

    @Override
    public String dormir() {
        return "El guepardo le gusta mucho dormir en primavera";
    }

    @Override
    public String correr() {
        return "Al guerpado le facina la correr por la llanura";
    }

    @Override
    public String comunicarse() {
        return "El guepardo se comunica por su velocidad";
    }
}
