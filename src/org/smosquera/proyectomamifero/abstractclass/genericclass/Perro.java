package org.smosquera.proyectomamifero.abstractclass.genericclass;

import org.smosquera.proyectomamifero.abstractclass.Canino;

public class Perro extends Canino {
    public Perro( int fuerzaMordida, float tamanoColmillos, String color, String habitat, float altura, float largo, float peso, String nombreCientifico) {
        super(tamanoColmillos, color, habitat, altura, largo, peso, nombreCientifico);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    @Override
    public String comer() {
        return "A el perro le gusta comer mucho";
    }

    @Override
    public String dormir() {
        return "A el perro le gusta dormir en su " +  this.habitat;
    }

    @Override
    public String correr() {
        return "A el perro le gusta correr por el llano";
    }

    @Override
    public String comunicarse() {
        return "El perro se comunica con la cola";
    }
    private int fuerzaMordida;
}
