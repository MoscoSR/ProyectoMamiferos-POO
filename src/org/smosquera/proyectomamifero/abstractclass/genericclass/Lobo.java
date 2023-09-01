package org.smosquera.proyectomamifero.abstractclass.genericclass;

import org.smosquera.proyectomamifero.abstractclass.Canino;

public class Lobo extends Canino {
    public Lobo(int numCamada, String especieLobo,  float tamanoColmillos, String color, String habitat, float altura, float largo, float peso, String nombreCientifico) {
        super(tamanoColmillos, color, habitat, altura, largo, peso, nombreCientifico);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public int getNumCamada() {
        return numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public String comer() {
        return "El lobo come con su " + this.numCamada + "  amigos en los llanos";
    }

    @Override
    public String dormir() {
        return "El lobo duerme con su " +  this.numCamada + " amigos todos los dias";
    }

    @Override
    public String correr() {
        return "La especie " + this.especieLobo + " es mas rapida que un lobo normal";
    }

    @Override
    public String comunicarse() {
        return "El lobo se comunica con sus " +  this.numCamada + " amigos a traves de rugido";
    }
    private int numCamada;
    private String especieLobo;
}
