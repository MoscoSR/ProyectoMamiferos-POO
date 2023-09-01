package org.smosquera.proyectomamifero.abstractclass;
abstract public class Canino extends Mamifero {
    public Canino( float tamanoColmillos, String color, String habitat, float altura, float largo, float peso, String nombreCientifico) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamanoColmillos = tamanoColmillos;
    }

    public String getColor() {
        return color;
    }

    public float getTamanoColmillos() {
        return tamanoColmillos;
    }
    protected String color;
    protected float tamanoColmillos;
}
