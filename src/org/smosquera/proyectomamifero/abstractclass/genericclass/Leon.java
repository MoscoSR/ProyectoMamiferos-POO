package org.smosquera.proyectomamifero.abstractclass.genericclass;

import org.smosquera.proyectomamifero.abstractclass.Felino;

public class Leon extends Felino {

    public Leon(float tamanoGarras, int velocidad, String habitat, float altura, float largo, float peso, String nombreCientifico) {
        super( tamanoGarras, velocidad,habitat, altura, largo, peso, nombreCientifico);
    }
    public Leon ( int numManada, int potenciaRugido, float tamanoGarras, int velocidad, String habitat, float altura, float largo, float peso, String nombreCientifico) {
            this( tamanoGarras, velocidad,habitat, altura, largo, peso, nombreCientifico);
            this.numManada = numManada;
            this.potenciaRugido = potenciaRugido;
    }

    public int getNumManada() {
        return numManada;
    }

    public int getPotenciaRugido() {
        return potenciaRugido;
    }

    @Override
    public String comer() {
        return "El leon come con su: " + this.numManada + "  indiviudos en  las llanuras africanas";
    }

    @Override
    public String dormir() {
        return "El leon duerme con su " + numManada + " amigos  en el lago";
    }

    @Override
    public String correr() {
        return "El leon correo con su " +  numManada + " individuos por la laguna";
    }

    @Override
    public String comunicarse() {
        return "El leon se comunica con su " + this.numManada + " amigos por rugido" + " y el leon trae ruge con una fuerza de " + this.potenciaRugido;
    }

    private int numManada;
    private int potenciaRugido;
}
